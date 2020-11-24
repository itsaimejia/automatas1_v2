// Generated from .\corchetes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link corchetesParser}.
 */
public interface corchetesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link corchetesParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(corchetesParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(corchetesParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link corchetesParser#multicomp}.
	 * @param ctx the parse tree
	 */
	void enterMulticomp(corchetesParser.MulticompContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#multicomp}.
	 * @param ctx the parse tree
	 */
	void exitMulticomp(corchetesParser.MulticompContext ctx);
	/**
	 * Enter a parse tree produced by {@link corchetesParser#compuesto}.
	 * @param ctx the parse tree
	 */
	void enterCompuesto(corchetesParser.CompuestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#compuesto}.
	 * @param ctx the parse tree
	 */
	void exitCompuesto(corchetesParser.CompuestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link corchetesParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(corchetesParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(corchetesParser.BaseContext ctx);
}