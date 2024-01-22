// Generated from j.g4 by ANTLR 4.7.1
package w3.script.jass.extensible_jass;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jParser}.
 */
public interface jListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(jParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(jParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(jParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(jParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(jParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(jParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#args_tail}.
	 * @param ctx the parse tree
	 */
	void enterArgs_tail(jParser.Args_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#args_tail}.
	 * @param ctx the parse tree
	 */
	void exitArgs_tail(jParser.Args_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(jParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(jParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(jParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(jParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#array_ref}.
	 * @param ctx the parse tree
	 */
	void enterArray_ref(jParser.Array_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#array_ref}.
	 * @param ctx the parse tree
	 */
	void exitArray_ref(jParser.Array_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void enterFuncRef(jParser.FuncRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void exitFuncRef(jParser.FuncRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(jParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(jParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#atomic_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_expr(jParser.Atomic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#atomic_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_expr(jParser.Atomic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(jParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(jParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(jParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(jParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#global_var_list}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_var_list(jParser.Global_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#global_var_list}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_var_list(jParser.Global_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(jParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(jParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(jParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(jParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(jParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(jParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#native_func}.
	 * @param ctx the parse tree
	 */
	void enterNative_func(jParser.Native_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#native_func}.
	 * @param ctx the parse tree
	 */
	void exitNative_func(jParser.Native_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#local_var_list}.
	 * @param ctx the parse tree
	 */
	void enterLocal_var_list(jParser.Local_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#local_var_list}.
	 * @param ctx the parse tree
	 */
	void exitLocal_var_list(jParser.Local_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(jParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(jParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(jParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(jParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#else_if_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_clause(jParser.Else_if_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#else_if_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_clause(jParser.Else_if_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(jParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(jParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else(jParser.If_then_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else(jParser.If_then_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(jParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(jParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#exitwhen}.
	 * @param ctx the parse tree
	 */
	void enterExitwhen(jParser.ExitwhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#exitwhen}.
	 * @param ctx the parse tree
	 */
	void exitExitwhen(jParser.ExitwhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(jParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(jParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(jParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(jParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(jParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(jParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#default_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_case_clause(jParser.Default_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#default_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_case_clause(jParser.Default_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(jParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(jParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(jParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(jParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(jParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(jParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(jParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(jParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(jParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(jParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(jParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(jParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link jParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(jParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link jParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(jParser.ProgramContext ctx);
}