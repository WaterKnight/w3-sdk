// Generated from AntlrFDF.g4 by ANTLR 4.7.1
package w3.skin.frame_defs.impl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrFDFParser}.
 */
public interface AntlrFDFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrFDFParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(AntlrFDFParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrFDFParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(AntlrFDFParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrFDFParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(AntlrFDFParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrFDFParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(AntlrFDFParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrFDFParser#stringListContent}.
	 * @param ctx the parse tree
	 */
	void enterStringListContent(AntlrFDFParser.StringListContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrFDFParser#stringListContent}.
	 * @param ctx the parse tree
	 */
	void exitStringListContent(AntlrFDFParser.StringListContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrFDFParser#stringAssign}.
	 * @param ctx the parse tree
	 */
	void enterStringAssign(AntlrFDFParser.StringAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrFDFParser#stringAssign}.
	 * @param ctx the parse tree
	 */
	void exitStringAssign(AntlrFDFParser.StringAssignContext ctx);
}