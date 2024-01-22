// Generated from txt.g4 by ANTLR 4.7.1
package w3.common.txt.impl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link txtParser}.
 */
public interface txtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link txtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(txtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link txtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(txtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link txtParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(txtParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link txtParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(txtParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link txtParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(txtParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link txtParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(txtParser.RootContext ctx);
}