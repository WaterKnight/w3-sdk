import org.antlr.v4.runtime.*;
import w3.common.core.UTF8;
import w3.script.jass.extensible_jass.*;
import w3.script.jass.extensible_jass.specific.*;
import w3.script.jass.extensible_jass.specific.IfThenElse;
import w3.script.jass.extensible_jass.specific.Loop;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        final InputStream inputStream = Main.class.getResourceAsStream("test.j");

        final UTF8 reader = new UTF8(inputStream, false, true);

        final String input = reader.readAll(false);
        System.out.println("parsing...");
        System.out.println(input);
        inputStream.close();

        final CharStream antlrStream = CharStreams.fromString(input);

        final Lexer lexer = new jLexer(antlrStream);

        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        tokenStream.fill();

        final List<Token> tokens = tokenStream.getTokens();

        final jParser parser = new jParser(new CommonTokenStream(new ListTokenSource(tokens)));

        final GlobalsBlock globalsBlock = new GlobalsBlock();
        final List<NativeFunc> nativeFuncs = new ArrayList<>();
        final List<Func> funcs = new ArrayList<>();

        parser.program().file().forEach(fileContext -> {
            fileContext.declaration().forEach(declarationContext -> {
                var globalsContext = declarationContext.globals();
                if (globalsContext != null) {
                    var varDeclarations = globalsContext.global_var_list().var_declaration();
                    varDeclarations.forEach(varDeclarationContext -> {
                        final String type = varDeclarationContext.type().getText();
                        final String id = varDeclarationContext.ID().getText();
                        final boolean array = varDeclarationContext.ARRAY() != null;
                        final String value = varDeclarationContext.expr().getText();

                        final GlobalVar globalVar = new GlobalVar();
                        globalVar.setType(type);
                        globalVar.setName(id);
                        globalVar.setArray(array);
                        globalVar.setValue(value);

                        globalsBlock.getGlobalVars().add(globalVar);
                    });
                }
                var nativeFuncContext = declarationContext.native_func();
                if (nativeFuncContext != null) {
                    final boolean isConstant = nativeFuncContext.CONSTANT() != null;
                    final String name = nativeFuncContext.func_declaration().ID().getText();
                    final jParser.TypeContext typeContext = nativeFuncContext.func_declaration().type();
                    final String returnType = Optional.ofNullable(typeContext).map(RuleContext::getText).orElse(null);

                    final NativeFunc nativeFunc = new NativeFunc();
                    nativeFunc.setConstant(isConstant);
                    nativeFunc.setName(name);
                    final var paramList = nativeFuncContext.func_declaration().param_list();
                    final int paramListLength = Optional.ofNullable(paramList).map(jParser.Param_listContext::ID).map(List::size).orElse(0);
                    for (int i = 0; i < paramListLength; i++) {
                        final String paramType = paramList.type(i).getText();
                        final String paramName = paramList.ID(i).getText();
                        final Parameter parameter = new Parameter();
                        parameter.setType(paramType);
                        parameter.setName(paramName);
                        nativeFunc.getParameters().add(parameter);
                    }
                    nativeFunc.setReturnType(returnType);
                    nativeFuncs.add(nativeFunc);
                }
            });
            fileContext.func().forEach(funcContext -> {
                if (funcContext != null) {
                    final boolean isConstant = funcContext.CONSTANT() != null;
                    final String name = funcContext.func_declaration().ID().getText();
                    final String returnType = Optional.ofNullable(funcContext.func_declaration().type()).map(RuleContext::getText).orElse(null);

                    final Func func = new Func();
                    func.setConstant(isConstant);
                    func.setName(name);
                    final var paramList = funcContext.func_declaration().param_list();
                    final int paramLength = Optional.ofNullable(paramList).map(jParser.Param_listContext::ID).map(List::size).orElse(0);
                    for (int i = 0; i < paramLength; i++) {
                        final String paramType = paramList.type(i).getText();
                        final String paramName = paramList.ID(i).getText();
                        final Parameter parameter = new Parameter();
                        parameter.setType(paramType);
                        parameter.setName(paramName);
                        func.getParameters().add(parameter);
                    }
                    func.setReturnType(returnType);

                    final FuncBody funcBody = new FuncBody();
                    funcContext.statement_list().statement().forEach(statementContext -> {
                        funcBody.getStatements().add(new StatementContextToStatementMapper().mapStatement(statementContext));
                    });
                    func.setFuncBody(funcBody);

                    funcs.add(func);
                }
            });
        });

        final JassWriter jassWriter = new JassWriter(new PrintStream(System.out));

        jassWriter.println(Globals.GLOBALS);
        jassWriter.beginBlock();
        globalsBlock.getGlobalVars().forEach(globalVar -> {
            jassWriter.print(jassWriter.formatIndent());
            jassWriter.print(globalVar.getType());
            if (globalVar.isArray()) {
                jassWriter.print(" ");
                jassWriter.print(GlobalVarList.ARRAY);
            }
            jassWriter.print(" ");
            jassWriter.print(globalVar.getName());
            if (globalVar.getValue() != null) {
                jassWriter.print(" ");
                jassWriter.print(GlobalVarList.ASSIGN);
                jassWriter.print(" ");
                jassWriter.print(globalVar.getValue());
            }
            jassWriter.println();
        });
        jassWriter.endBlock();
        jassWriter.println(Globals.ENDGLOBALS);

        nativeFuncs.forEach(nativeFunc -> {
            if (nativeFunc.isConstant()) {
                jassWriter.print(w3.script.jass.extensible_jass.specific.NativeFunc.CONSTANT);
                jassWriter.print(" ");
            }
            jassWriter.print(w3.script.jass.extensible_jass.specific.NativeFunc.NATIVE);
            jassWriter.print(" ");
            jassWriter.print(nativeFunc.getName());
            jassWriter.print(" ");
            jassWriter.print(FuncDeclaration.TAKES);
            jassWriter.print(" ");
            if (nativeFunc.getParameters().isEmpty()) {
                jassWriter.print(FuncDeclaration.NOTHING);
            } else {
                jassWriter.print(nativeFunc.getParameters().stream().map(param -> param.getType() + " " + param.getName()).collect(Collectors.joining(jassWriter.formatTerminal(new Comma()) + " ")));
            }
            jassWriter.print(" ");
            jassWriter.print(FuncDeclaration.RETURNS);
            jassWriter.print(" ");
            if (nativeFunc.getReturnType() != null) {
                jassWriter.print(nativeFunc.getReturnType());
            } else {
                jassWriter.print(FuncDeclaration.NOTHING);
            }
            jassWriter.println();
        });

        funcs.forEach(func -> {
            if (func.isConstant()) {
                jassWriter.print(w3.script.jass.extensible_jass.specific.Func.CONSTANT);
                jassWriter.print(" ");
            }
            jassWriter.print(new w3.script.jass.extensible_jass.specific.Function());
            jassWriter.print(" ");
            jassWriter.print(func.getName());
            jassWriter.print(" ");
            jassWriter.print(FuncDeclaration.TAKES);
            jassWriter.print(" ");
            if (func.getParameters().isEmpty()) {
                jassWriter.print(FuncDeclaration.NOTHING);
            } else {
                jassWriter.print(func.getParameters().stream().map(param -> param.getType() + " " + param.getName()).collect(Collectors.joining(jassWriter.formatTerminal(new Comma()) + " ")));
            }
            jassWriter.print(" ");
            jassWriter.print(FuncDeclaration.RETURNS);
            jassWriter.print(" ");
            if (func.getReturnType() != null) {
                jassWriter.print(func.getReturnType());
            } else {
                jassWriter.print(FuncDeclaration.NOTHING);
            }
            jassWriter.println();

            jassWriter.beginBlock();

            final List<Statement> statements = func.getFuncBody().getStatements();

            if (!statements.isEmpty()) {
                statements.forEach(statement -> {
                    jassWriter.println(jassWriter.formatStatement(statement));
                });
            }

            jassWriter.endBlock();

            jassWriter.print(w3.script.jass.extensible_jass.specific.Func.ENDFUNCTION);
            jassWriter.println();
        });
    }
}
