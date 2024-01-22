import w3.script.jass.extensible_jass.jParser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatementContextToStatementMapper {
    public Statement mapStatement(jParser.StatementContext statementContext) {
        if (statementContext.call() != null) {
            return mapCall(statementContext.call());
        }
        if (statementContext.debug() != null) {
            return mapDebug(statementContext.debug());
        }
        if (statementContext.if_then_else() != null) {
            return mapIfThenElse(statementContext.if_then_else());
        }
        if (statementContext.loop() != null) {
            return mapLoop(statementContext.loop());
        }
        if (statementContext.return_statement() != null) {
            return mapReturn(statementContext.return_statement());
        }
        if (statementContext.exitwhen() != null) {
            return mapExitwhen(statementContext.exitwhen());
        }
        if (statementContext.select() != null) {
            return mapSelect(statementContext.select());
        }
        throw new AssertionError();
    }

    private CallStatement mapCall(jParser.CallContext callContext) {
        final CallStatement callStatement = new CallStatement();
        callStatement.setFuncCall(mapFuncCall(callContext.func_call()));
        return callStatement;
    }

    private Argument mapArgContextToArg(jParser.ExprContext argContext) {
        final Argument arg = new Argument();
        arg.setExpr(mapExpr(argContext));
        return arg;
    }

    private DebugStatement mapDebug(jParser.DebugContext debugContext) {
        final DebugStatement debugStatement = new DebugStatement();
        debugStatement.setContent(mapStatement(debugContext.statement()));
        return debugStatement;
    }

    private IfThenElseStatement mapIfThenElse(jParser.If_then_elseContext ifThenElseContext) {
        final IfThenElseStatement ifThenElseStatement = new IfThenElseStatement();
        final IfClause ifClause = new IfClause();
        ifClause.setCondition(mapExpr(ifThenElseContext.expr()));
        ifClause.setThenClause(ifThenElseContext.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        ifThenElseStatement.setIfClause(ifClause);
        ifThenElseStatement.setElseifClauses(ifThenElseContext.else_if_clause().stream().map(this::mapElseIfClause).collect(Collectors.toList()));
        final var elseClause = ifThenElseContext.else_clause();
        if (elseClause != null) {
            ifThenElseStatement.setElseClause(elseClause.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        }
        return ifThenElseStatement;
    }

    private IfClause mapIfClause(jParser.If_then_elseContext ifThenElseContext) {
        final IfClause ifClause = new IfClause();
        ifClause.setCondition(mapExpr(ifThenElseContext.expr()));
        ifClause.setThenClause(ifThenElseContext.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        return ifClause;
    }

    private IfClause mapElseIfClause(jParser.Else_if_clauseContext elseIfClauseContext) {
        final IfClause ifClause = new IfClause();
        ifClause.setCondition(mapExpr(elseIfClauseContext.expr()));
        ifClause.setThenClause(elseIfClauseContext.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        return ifClause;
    }

    private LoopStatement mapLoop(jParser.LoopContext loopContext) {
        final LoopStatement loop = new LoopStatement();
        loop.setStatements(loopContext.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        return loop;
    }

    private ReturnStatement mapReturn(jParser.Return_statementContext returnStatementContext) {
        final ReturnStatement returnStatement = new ReturnStatement();
        returnStatement.setValue(mapExpr(returnStatementContext.expr()));
        return returnStatement;
    }

    private ExitwhenStatement mapExitwhen(jParser.ExitwhenContext exitwhenContext) {
        final ExitwhenStatement exitwhenStatement = new ExitwhenStatement();
        exitwhenStatement.setCondition(mapExpr(exitwhenContext.expr()));
        return exitwhenStatement;
    }

    private SelectStatement mapSelect(jParser.SelectContext selectContext) {
        final SelectStatement selectStatement = new SelectStatement();
        selectStatement.setDiscriminator(mapExpr(selectContext.expr()));
        selectStatement.setCaseClauses(selectContext.case_clause().stream().map(this::mapCaseClause).collect(Collectors.toList()));
        if (selectContext.default_case_clause() != null) {
            selectStatement.setDefaultClause(mapDefaultClause(selectContext.default_case_clause()));
        }
        return selectStatement;
    }

    private CaseClause mapCaseClause(jParser.Case_clauseContext caseClauseContext) {
        final CaseClause caseClause = new CaseClause();
        caseClause.setMatchingExpr(mapExpr(caseClauseContext.expr()));
        caseClause.setStatements(caseClauseContext.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        return caseClause;
    }

    private DefaultClause mapDefaultClause(jParser.Default_case_clauseContext defaultCaseClauseContext) {
        final DefaultClause defaultClause = new DefaultClause();
        defaultClause.setStatements(defaultCaseClauseContext.statement_list().statement().stream().map(this::mapStatement).collect(Collectors.toList()));
        return defaultClause;
    }

    private Expr mapExpr(jParser.ExprContext exprContext) {
        if (exprContext.BINARY_OP() != null) {
            return mapBinaryExpr(exprContext);
        }
        if (exprContext.atomic_expr() != null) {
            return mapAtomicExpr(exprContext.atomic_expr());
        }
        if (exprContext.expr() != null) {
            return mapExpr(exprContext.expr());
        }
        throw new AssertionError();
    }

    private Expr mapAtomicExpr(jParser.Atomic_exprContext exprContext) {
        if (exprContext.ID() != null) {
            return mapIdExpr(exprContext);
        }
        if (exprContext.func_call() != null) {
            return mapFuncCall(exprContext.func_call());
        }
        if (exprContext.array_ref() != null) {
            return mapArrayRef(exprContext.array_ref());
        }
        if (exprContext.funcRef() != null) {
            return mapFuncRef(exprContext.funcRef());
        }
        if (exprContext.unary_op() != null) {
            return mapUnaryExpr(exprContext.unary_op());
        }
        if (exprContext.literal() != null) {
            return mapLiteral(exprContext.literal());
        }
        throw new AssertionError();
    }

    private BinaryExpr mapBinaryExpr(jParser.ExprContext exprContext) {
        final BinaryExpr binaryExpr = new BinaryExpr();
        binaryExpr.setLeftExpr(mapAtomicExpr(exprContext.atomic_expr()));
        binaryExpr.setOperator(exprContext.BINARY_OP().getText());
        binaryExpr.setRightExpr(mapExpr(exprContext.expr()));
        return binaryExpr;
    }

    private IdExpr mapIdExpr(jParser.Atomic_exprContext exprContext) {
        final IdExpr idExpr = new IdExpr();
        idExpr.setId(exprContext.ID().getText());
        return idExpr;
    }

    private FuncCall mapFuncCall(jParser.Func_callContext funcCallContext) {
        final FuncCall funcCall = new FuncCall();
        funcCall.setFuncName(funcCallContext.ID().getText());
        final List<jParser.ExprContext> argContexts = new ArrayList<>();
        argContexts.add(funcCallContext.args().expr());
        argContexts.addAll(funcCallContext.args().args_tail().stream().map(jParser.Args_tailContext::expr).collect(Collectors.toList()));
        funcCall.setArguments(argContexts.stream().map(this::mapArgContextToArg).collect(Collectors.toList()));
        return funcCall;
    }

    private ArrayRef mapArrayRef(jParser.Array_refContext arrayRefContext) {
        final ArrayRef arrayRef = new ArrayRef();
        arrayRef.setArrayName(arrayRefContext.getText());
        arrayRef.setIndex(mapExpr(arrayRefContext.expr()));
        return arrayRef;
    }

    private FuncRef mapFuncRef(jParser.FuncRefContext funcRefContext) {
        final FuncRef funcRef = new FuncRef();
        funcRef.setFuncName(funcRefContext.ID().getText());
        return funcRef;
    }

    private UnaryExpr mapUnaryExpr(jParser.Unary_opContext unaryOpContext) {
        final UnaryExpr unaryExpr = new UnaryExpr();
        unaryExpr.setOperator(unaryOpContext.UNARY_OP().getText());
        unaryExpr.setContent(mapExpr(unaryOpContext.expr()));
        return unaryExpr;
    }

    private Literal mapLiteral(jParser.LiteralContext literalContext) {
        final Literal literal = new Literal();
        if (literalContext.BOOL() != null) {
            return new BoolLiteral(Boolean.parseBoolean(literalContext.BOOL().getText()));
        }
        if (literalContext.INT() != null) {
            return new IntLiteral(Integer.parseInt(literalContext.INT().getText()));
        }
        if (literalContext.REAL() != null) {
            return new RealLiteral(Double.parseDouble(literalContext.REAL().getText()));
        }
        if (literalContext.STRING_LITERAL() != null) {
            return new StringLiteral(literalContext.STRING_LITERAL().getText());
        }
        if (literalContext.NULL() != null) {
            return new NullLiteral();
        }
        return literal;
    }
}
