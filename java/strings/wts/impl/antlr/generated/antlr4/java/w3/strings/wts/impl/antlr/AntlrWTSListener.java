// Generated from AntlrWTS.g4 by ANTLR 4.7.1
package w3.strings.wts.impl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrWTSParser}.
 */
public interface AntlrWTSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrWTSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AntlrWTSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrWTSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AntlrWTSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrWTSParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(AntlrWTSParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrWTSParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(AntlrWTSParser.RootContext ctx);
}