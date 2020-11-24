// Generated from .\corchetes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class corchetesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, NUMBER=3, COMA=4, WS=5;
	public static final int
		RULE_inicio = 0, RULE_multicomp = 1, RULE_compuesto = 2, RULE_base = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "multicomp", "compuesto", "base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "CLOSE", "NUMBER", "COMA", "WS"
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
	public String getGrammarFileName() { return "corchetes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public corchetesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public List<CompuestoContext> compuesto() {
			return getRuleContexts(CompuestoContext.class);
		}
		public CompuestoContext compuesto(int i) {
			return getRuleContext(CompuestoContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				compuesto();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN );
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

	public static class MulticompContext extends ParserRuleContext {
		public List<CompuestoContext> compuesto() {
			return getRuleContexts(CompuestoContext.class);
		}
		public CompuestoContext compuesto(int i) {
			return getRuleContext(CompuestoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(corchetesParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(corchetesParser.COMA, i);
		}
		public MulticompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterMulticomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitMulticomp(this);
		}
	}

	public final MulticompContext multicomp() throws RecognitionException {
		MulticompContext _localctx = new MulticompContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multicomp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			compuesto();
			setState(16); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(14);
					match(COMA);
					setState(15);
					compuesto();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(18); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CompuestoContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(corchetesParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(corchetesParser.CLOSE, 0); }
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public CompuestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compuesto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterCompuesto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitCompuesto(this);
		}
	}

	public final CompuestoContext compuesto() throws RecognitionException {
		CompuestoContext _localctx = new CompuestoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compuesto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(OPEN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN || _la==NUMBER) {
				{
				setState(21);
				base();
				}
			}

			setState(24);
			match(CLOSE);
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

	public static class BaseContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(corchetesParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(corchetesParser.NUMBER, i);
		}
		public List<CompuestoContext> compuesto() {
			return getRuleContexts(CompuestoContext.class);
		}
		public CompuestoContext compuesto(int i) {
			return getRuleContext(CompuestoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(corchetesParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(corchetesParser.COMA, i);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(26);
					match(NUMBER);
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(27);
							match(COMA);
							setState(30);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case NUMBER:
								{
								setState(28);
								match(NUMBER);
								}
								break;
							case OPEN:
								{
								setState(29);
								compuesto();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							} 
						}
						setState(36);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					}
					break;
				case OPEN:
					{
					setState(37);
					compuesto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN || _la==NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\6\3\23\n\3\r\3"+
		"\16\3\24\3\4\3\4\5\4\31\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5!\n\5\7\5#\n\5"+
		"\f\5\16\5&\13\5\3\5\6\5)\n\5\r\5\16\5*\3\5\4\24$\2\6\2\4\6\b\2\2\2/\2"+
		"\13\3\2\2\2\4\17\3\2\2\2\6\26\3\2\2\2\b(\3\2\2\2\n\f\5\6\4\2\13\n\3\2"+
		"\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\22\5\6\4\2"+
		"\20\21\7\6\2\2\21\23\5\6\4\2\22\20\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2"+
		"\24\22\3\2\2\2\25\5\3\2\2\2\26\30\7\3\2\2\27\31\5\b\5\2\30\27\3\2\2\2"+
		"\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7\4\2\2\33\7\3\2\2\2\34$\7\5\2\2\35"+
		" \7\6\2\2\36!\7\5\2\2\37!\5\6\4\2 \36\3\2\2\2 \37\3\2\2\2!#\3\2\2\2\""+
		"\35\3\2\2\2#&\3\2\2\2$%\3\2\2\2$\"\3\2\2\2%)\3\2\2\2&$\3\2\2\2\')\5\6"+
		"\4\2(\34\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\t\3\2\2\2\t"+
		"\r\24\30 $(*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}