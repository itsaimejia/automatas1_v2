// Generated from .\calculadora.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculadoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIG=1, OPEN=2, CLOSE=3, EQU=4, NUM=5, VAR=6, NLINE=7, WS=8;
	public static final int
		RULE_initial = 0, RULE_option = 1, RULE_oper = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"initial", "option", "oper"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SIG", "OPEN", "CLOSE", "EQU", "NUM", "VAR", "NLINE", "WS"
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
	public String getGrammarFileName() { return "calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculadoraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitialContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculadoraListener ) ((calculadoraListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculadoraListener ) ((calculadoraListener)listener).exitInitial(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initial);
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
				option();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN) | (1L << NUM) | (1L << VAR) | (1L << NLINE))) != 0) );
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode NLINE() { return getToken(calculadoraParser.NLINE, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public TerminalNode VAR() { return getToken(calculadoraParser.VAR, 0); }
		public TerminalNode EQU() { return getToken(calculadoraParser.EQU, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculadoraListener ) ((calculadoraListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculadoraListener ) ((calculadoraListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_option);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(11);
					oper(0);
					}
					break;
				case 2:
					{
					setState(12);
					match(VAR);
					setState(13);
					match(EQU);
					setState(14);
					oper(0);
					}
					break;
				}
				setState(17);
				match(NLINE);
				}
				break;
			case NLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(NLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(calculadoraParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(calculadoraParser.VAR, 0); }
		public TerminalNode OPEN() { return getToken(calculadoraParser.OPEN, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(calculadoraParser.CLOSE, 0); }
		public TerminalNode SIG() { return getToken(calculadoraParser.SIG, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculadoraListener ) ((calculadoraListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculadoraListener ) ((calculadoraListener)listener).exitOper(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		return oper(0);
	}

	private OperContext oper(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperContext _localctx = new OperContext(_ctx, _parentState);
		OperContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_oper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(23);
				match(NUM);
				}
				break;
			case VAR:
				{
				setState(24);
				match(VAR);
				}
				break;
			case OPEN:
				{
				setState(25);
				match(OPEN);
				setState(26);
				oper(0);
				setState(27);
				match(CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oper);
					setState(31);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(32);
					match(SIG);
					setState(33);
					oper(5);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return oper_sempred((OperContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oper_sempred(OperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\5\3\22\n\3\3\3\3"+
		"\3\3\3\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\7\4"+
		"%\n\4\f\4\16\4(\13\4\3\4\2\3\6\5\2\4\6\2\2\2,\2\t\3\2\2\2\4\26\3\2\2\2"+
		"\6\37\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3"+
		"\2\2\2\f\3\3\2\2\2\r\22\5\6\4\2\16\17\7\b\2\2\17\20\7\6\2\2\20\22\5\6"+
		"\4\2\21\r\3\2\2\2\21\16\3\2\2\2\22\23\3\2\2\2\23\24\7\t\2\2\24\27\3\2"+
		"\2\2\25\27\7\t\2\2\26\21\3\2\2\2\26\25\3\2\2\2\27\5\3\2\2\2\30\31\b\4"+
		"\1\2\31 \7\7\2\2\32 \7\b\2\2\33\34\7\4\2\2\34\35\5\6\4\2\35\36\7\5\2\2"+
		"\36 \3\2\2\2\37\30\3\2\2\2\37\32\3\2\2\2\37\33\3\2\2\2 &\3\2\2\2!\"\f"+
		"\6\2\2\"#\7\3\2\2#%\5\6\4\7$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'"+
		"\7\3\2\2\2(&\3\2\2\2\7\13\21\26\37&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}