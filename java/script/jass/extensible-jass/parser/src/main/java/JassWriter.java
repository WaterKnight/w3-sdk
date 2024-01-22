import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.Keyword;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;
import w3.script.jass.extensible_jass.specific.*;

import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class JassWriter {
    private final PrintStream printStream;

    public JassWriter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void println() {
        printStream.println();
    }

    public void print(JassTerminal jassTerminal) {
        printStream.print(formatTerminal(jassTerminal));
    }

    public void println(JassTerminal jassTerminal) {
        printStream.println(formatTerminal(jassTerminal));
    }

    public void print(String str) {
        printStream.print(str);
    }

    public void println(String str) {
        printStream.println(str);
    }

    private int indent = 0;

    public void beginBlock() {
        indent++;
    }

    public void endBlock() {
        indent--;
    }

    public String formatIndent() {
        return "\t".repeat(indent);
    }

    public String formatStatement(Statement statement) {
        if (statement instanceof CallStatement) {
            return formatCallStatement((CallStatement) statement);
        }
        if (statement instanceof IfThenElseStatement) {
            return formatIfThenElseStatement((IfThenElseStatement) statement);
        }
        if (statement instanceof LoopStatement) {
            return formatLoopStatement((LoopStatement) statement);
        }
        if (statement instanceof DebugStatement) {
            return formatDebugStatement((DebugStatement) statement);
        }
        if (statement instanceof ReturnStatement) {
            return formatReturnStatement((ReturnStatement) statement);
        }
        if (statement instanceof ExitwhenStatement) {
            return formatExitwhenStatement((ExitwhenStatement) statement);
        }
        if (statement instanceof SelectStatement) {
            return formatSelectStatement((SelectStatement) statement);
        }
        throw new AssertionError();
    }

    private String formatCallStatement(CallStatement callStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formatIndent());
        stringBuilder.append(formatTerminal(Call.CALL));
        stringBuilder.append(" ");
        stringBuilder.append(formatFuncCall(callStatement.getFuncCall()));
        return stringBuilder.toString();
    }

    private String formatIfThenElseStatement(IfThenElseStatement ifThenElseStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formatIndent());
        stringBuilder.append(formatTerminal(IfThenElse.IF));
        stringBuilder.append(" ");
        stringBuilder.append(formatExpr(ifThenElseStatement.getIfClause().getCondition()));
        stringBuilder.append(" ");
        stringBuilder.append(formatTerminal(IfThenElse.THEN));
        stringBuilder.append("\n");
        beginBlock();
        ifThenElseStatement.getIfClause().getThenClause().forEach(statement -> {
            stringBuilder.append(formatStatement(statement));
            stringBuilder.append("\n");
        });
        endBlock();
        ifThenElseStatement.getElseifClauses().forEach(elseIfClause -> {
            stringBuilder.append(formatIndent());
            stringBuilder.append(formatTerminal(ElseIfClause.ELSEIF));
            stringBuilder.append(" ");
            stringBuilder.append(formatExpr(elseIfClause.getCondition()));
            stringBuilder.append(" ");
            stringBuilder.append(formatTerminal(ElseIfClause.THEN));
            stringBuilder.append("\n");
            beginBlock();
            elseIfClause.getThenClause().forEach(statement -> {
                stringBuilder.append(formatStatement(statement));
                stringBuilder.append("\n");
            });
            endBlock();
        });
        if (ifThenElseStatement.getElseClause() != null && !ifThenElseStatement.getElseClause().isEmpty()) {
            stringBuilder.append(formatIndent());
            stringBuilder.append(formatTerminal(ElseClause.ELSE));
            stringBuilder.append("\n");
            beginBlock();
            ifThenElseStatement.getElseClause().forEach(statement -> {
                stringBuilder.append(formatStatement(statement));
                stringBuilder.append("\n");
            });
            endBlock();
        }
        stringBuilder.append(formatIndent());
        stringBuilder.append(formatTerminal(IfThenElse.ENDIF));
        return stringBuilder.toString();
    }

    private String formatLoopStatement(LoopStatement loopStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formatIndent());
        stringBuilder.append(Loop.LOOP);
        beginBlock();
        loopStatement.getStatements().forEach(statement -> {
            stringBuilder.append(formatIndent());
            stringBuilder.append(formatStatement(statement));
        });
        endBlock();
        stringBuilder.append(formatIndent());
        stringBuilder.append(Loop.ENDLOOP);
        return stringBuilder.toString();
    }

    private String formatDebugStatement(DebugStatement debugStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formatIndent());
        stringBuilder.append(formatTerminal(Debug.DEBUG));
        stringBuilder.append(" ");
        stringBuilder.append(formatStatement(debugStatement.getContent()));
        return stringBuilder.toString();
    }

    private String formatReturnStatement(ReturnStatement returnStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formatIndent());
        stringBuilder.append(formatTerminal(Return.RETURN));
        stringBuilder.append(" ");
        stringBuilder.append(formatExpr(returnStatement.getValue()));
        return stringBuilder.toString();
    }

    private String formatExitwhenStatement(ExitwhenStatement exitwhenStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formatIndent());
        stringBuilder.append(formatTerminal(Exitwhen.EXITWHEN));
        stringBuilder.append(" ");
        stringBuilder.append(formatExpr(exitwhenStatement.getCondition()));
        return stringBuilder.toString();
    }

    private String formatSelectStatement(SelectStatement selectStatement) {
        final StringBuilder stringBuilder = new StringBuilder();
        final Expr discriminator = selectStatement.getDiscriminator();
        final IfThenElseStatement ifThenElseStatement = new IfThenElseStatement();
        final AtomicBoolean first = new AtomicBoolean(true);
        selectStatement.getCaseClauses().forEach(caseClause -> {
            final IfClause ifClause = new IfClause();
            final BinaryExpr binaryExpr = new BinaryExpr();
            binaryExpr.setLeftExpr(discriminator);
            binaryExpr.setOperator(formatTerminal(new EqualityOp()));
            binaryExpr.setRightExpr(caseClause.getMatchingExpr());
            ifClause.setCondition(binaryExpr);
            ifClause.setThenClause(caseClause.getStatements());
            if (first.get()) {
                first.set(false);
                ifThenElseStatement.setIfClause(ifClause);
            } else {
                ifThenElseStatement.getElseifClauses().add(ifClause);
            }
        });
        if (selectStatement.getDefaultClause() != null) {
            ifThenElseStatement.setElseClause(selectStatement.getDefaultClause().getStatements());
        }
        stringBuilder.append(formatIfThenElseStatement(ifThenElseStatement));
        return stringBuilder.toString();
    }

    private String formatFuncCall(FuncCall funcCall) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(funcCall.getFuncName());
        stringBuilder.append(formatTerminal(new ParensLeft()));
        stringBuilder.append(funcCall.getArguments().stream().map(this::formatArgument).collect(Collectors.joining(formatTerminal(new Comma()) + " ")));
        stringBuilder.append(formatTerminal(new ParensRight()));
        return stringBuilder.toString();
    }

    private String formatArgument(Argument argument) {
        return formatExpr(argument.getExpr());
    }

    private String formatExpr(Expr expr) {
        if (expr instanceof Literal) {
            return formatLiteral((Literal) expr);
        }
        if (expr instanceof BinaryExpr) {
            return formatBinaryExpr((BinaryExpr) expr);
        }
        if (expr instanceof UnaryExpr) {
            return formatUnaryExpr((UnaryExpr) expr);
        }
        if (expr instanceof ArrayRef) {
            return formatArrayRef((ArrayRef) expr);
        }
        if (expr instanceof IdExpr) {
            return formatIdExpr((IdExpr) expr);
        }
        if (expr instanceof FuncRef) {
            return formatFuncRef((FuncRef) expr);
        }
        if (expr instanceof FuncCall) {
            return formatFuncCall((FuncCall) expr);
        }
        throw new AssertionError();
    }

    private String formatLiteral(Literal literal) {
        if (literal instanceof BoolLiteral) {
            return formatBoolLiteral((BoolLiteral) literal);
        }
        if (literal instanceof IntLiteral) {
            return formatIntLiteral((IntLiteral) literal);
        }
        if (literal instanceof RealLiteral) {
            return formatRealLiteral((RealLiteral) literal);
        }
        if (literal instanceof StringLiteral) {
            return formatStringLiteral((StringLiteral) literal);
        }
        if (literal instanceof NullLiteral) {
            return formatNullLiteral((NullLiteral) literal);
        }
        throw new AssertionError();
    }

    private String formatBinaryExpr(BinaryExpr binaryExpr) {
        return String.format("%s %s %s", formatExpr(binaryExpr.getLeftExpr()), binaryExpr.getOperator(), formatExpr(binaryExpr.getRightExpr()));
    }

    private String formatUnaryExpr(UnaryExpr unaryExpr) {
        return String.format("%s %s", unaryExpr.getOperator(), formatExpr(unaryExpr.getContent()));
    }

    private String formatArrayRef(ArrayRef arrayRef) {
        return String.format("%s%s%s%s", arrayRef.getArrayName(), formatTerminal(new w3.script.jass.extensible_jass.specific.BracketLeft()), formatExpr(arrayRef.getIndex()), formatTerminal(new w3.script.jass.extensible_jass.specific.BracketRight()));
    }

    private String formatIdExpr(IdExpr idExpr) {
        return idExpr.getId();
    }

    private String formatFuncRef(FuncRef funcRef) {
        return String.format("%s %s", formatTerminal(new w3.script.jass.extensible_jass.specific.Function()), funcRef.getFuncName());
    }

    /*private String formatFuncCall(FuncCall funcCall) {
        return String.format("%s%s%s%s", funcCall.getFuncName(), formatTerminal(new ParensLeft()), funcCall.getArguments().stream().map(Main::formatArgument).collect(Collectors.joining(new Comma() + " ")), formatTerminal(new ParensRight()));
    }*/

    private String formatBoolLiteral(BoolLiteral boolLiteral) {
        return boolLiteral.isValue() ? formatTerminal(new True()) : formatTerminal(new False());
    }

    private String formatIntLiteral(IntLiteral intLiteral) {
        return Integer.toString(intLiteral.getValue());
    }

    private String formatRealLiteral(RealLiteral realLiteral) {
        return Double.toString(realLiteral.getValue());
    }

    private String formatStringLiteral(StringLiteral stringLiteral) {
        return stringLiteral.getValue();
    }

    private String formatNullLiteral(NullLiteral nullLiteral) {
        return formatTerminal(new w3.script.jass.extensible_jass.specific.NullLiteral());
    }

    public String formatTerminal(JassTerminal jassTerminal) {
        final LexerValue lexerValue = jassTerminal.getLexerValue(new ParseContext());
        if (lexerValue instanceof Keyword) {
            return lexerValue.getValue().replaceAll("'", "");
        }
        return null;
    }
}
