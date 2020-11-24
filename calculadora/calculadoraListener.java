// Generated from .\calculadora.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculadoraParser}.
 */
public interface calculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculadoraParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(calculadoraParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculadoraParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(calculadoraParser.InitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculadoraParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(calculadoraParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculadoraParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(calculadoraParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculadoraParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(calculadoraParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculadoraParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(calculadoraParser.OperContext ctx);
}