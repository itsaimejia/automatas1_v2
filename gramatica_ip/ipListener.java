// Generated from .\ip.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ipParser}.
 */
public interface ipListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ipParser#ips}.
	 * @param ctx the parse tree
	 */
	void enterIps(ipParser.IpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipParser#ips}.
	 * @param ctx the parse tree
	 */
	void exitIps(ipParser.IpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(ipParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(ipParser.IpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(ipParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(ipParser.ConfigContext ctx);
}