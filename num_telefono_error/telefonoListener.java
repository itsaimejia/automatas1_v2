// Generated from .\telefono.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link telefonoParser}.
 */
public interface telefonoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link telefonoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(telefonoParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(telefonoParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link telefonoParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(telefonoParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(telefonoParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link telefonoParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(telefonoParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(telefonoParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link telefonoParser#telefono}.
	 * @param ctx the parse tree
	 */
	void enterTelefono(telefonoParser.TelefonoContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#telefono}.
	 * @param ctx the parse tree
	 */
	void exitTelefono(telefonoParser.TelefonoContext ctx);
	/**
	 * Enter a parse tree produced by {@link telefonoParser#lada}.
	 * @param ctx the parse tree
	 */
	void enterLada(telefonoParser.LadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#lada}.
	 * @param ctx the parse tree
	 */
	void exitLada(telefonoParser.LadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link telefonoParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(telefonoParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(telefonoParser.CuerpoContext ctx);
}