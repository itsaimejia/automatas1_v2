// Generated from .\ip.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ipParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GOTO199=1, GOTO249=2, GOTO255=3, DOT=4, SPACE=5;
	public static final int
		RULE_ips = 0, RULE_ip = 1, RULE_config = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"ips", "ip", "config"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GOTO199", "GOTO249", "GOTO255", "DOT", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ip.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ipParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IpsContext extends ParserRuleContext {
		public List<IpContext> ip() {
			return getRuleContexts(IpContext.class);
		}
		public IpContext ip(int i) {
			return getRuleContext(IpContext.class,i);
		}
		public IpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ips; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipListener ) ((ipListener)listener).enterIps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipListener ) ((ipListener)listener).exitIps(this);
		}
	}

	public final IpsContext ips() throws RecognitionException {
		IpsContext _localctx = new IpsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ips);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				ip();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOTO199) | (1L << GOTO249) | (1L << GOTO255))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IpContext extends ParserRuleContext {
		public List<ConfigContext> config() {
			return getRuleContexts(ConfigContext.class);
		}
		public ConfigContext config(int i) {
			return getRuleContext(ConfigContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ipParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ipParser.DOT, i);
		}
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipListener ) ((ipListener)listener).enterIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipListener ) ((ipListener)listener).exitIp(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			config();
			setState(12);
			match(DOT);
			setState(13);
			config();
			setState(14);
			match(DOT);
			setState(15);
			config();
			setState(16);
			match(DOT);
			setState(17);
			config();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode GOTO199() { return getToken(ipParser.GOTO199, 0); }
		public TerminalNode GOTO249() { return getToken(ipParser.GOTO249, 0); }
		public TerminalNode GOTO255() { return getToken(ipParser.GOTO255, 0); }
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipListener ) ((ipListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipListener ) ((ipListener)listener).exitConfig(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOTO199) | (1L << GOTO249) | (1L << GOTO255))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\30\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\2\2\5\2\4\6\2\3\3\2\3\5\2\25\2\t\3\2\2\2\4\r\3\2\2\2\6\25"+
		"\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2"+
		"\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\7\6\2\2\17\20\5\6\4\2\20\21\7\6\2\2"+
		"\21\22\5\6\4\2\22\23\7\6\2\2\23\24\5\6\4\2\24\5\3\2\2\2\25\26\t\2\2\2"+
		"\26\7\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}