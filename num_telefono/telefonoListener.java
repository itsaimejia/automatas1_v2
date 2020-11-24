// Generated from .\telefono.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link telefonoParser}.
 */
public interface telefonoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link telefonoParser#telefonos}.
	 * @param ctx the parse tree
	 */
	void enterTelefonos(telefonoParser.TelefonosContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#telefonos}.
	 * @param ctx the parse tree
	 */
	void exitTelefonos(telefonoParser.TelefonosContext ctx);
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
}