// Generated from Slk.g4 by ANTLR 4.7.1

	package w3.common.slk.impl.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlkParser}.
 */
public interface SlkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlkParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SlkParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlkParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SlkParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlkParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(SlkParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlkParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(SlkParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlkParser#recordPart}.
	 * @param ctx the parse tree
	 */
	void enterRecordPart(SlkParser.RecordPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlkParser#recordPart}.
	 * @param ctx the parse tree
	 */
	void exitRecordPart(SlkParser.RecordPartContext ctx);
}