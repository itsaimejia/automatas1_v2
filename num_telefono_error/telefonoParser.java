// Generated from .\telefono.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class telefonoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEIS=1, TRESNUM=2, DOSNUM=3, ABRIR=4, CERRAR=5, GUION=6, PUNTOCOMA=7, 
		PALERROR=8, NUMERO=9, WS=10;
	public static final int
		RULE_inicio = 0, RULE_record = 1, RULE_error = 2, RULE_telefono = 3, RULE_lada = 4, 
		RULE_cuerpo = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "record", "error", "telefono", "lada", "cuerpo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEIS", "TRESNUM", "DOSNUM", "ABRIR", "CERRAR", "GUION", "PUNTOCOMA", 
			"PALERROR", "NUMERO", "WS"
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
	public String getGrammarFileName() { return "telefono.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public telefonoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				record();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOSNUM) | (1L << ABRIR) | (1L << GUION) | (1L << PUNTOCOMA) | (1L << PALERROR) | (1L << NUMERO))) != 0) );
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

	public static class RecordContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(telefonoParser.PUNTOCOMA, 0); }
		public TelefonoContext telefono() {
			return getRuleContext(TelefonoContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR:
				{
				setState(17);
				telefono();
				}
				break;
			case DOSNUM:
			case GUION:
			case PUNTOCOMA:
			case PALERROR:
			case NUMERO:
				{
				setState(18);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(21);
			match(PUNTOCOMA);
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

	public static class ErrorContext extends ParserRuleContext {
		public List<TerminalNode> PALERROR() { return getTokens(telefonoParser.PALERROR); }
		public TerminalNode PALERROR(int i) {
			return getToken(telefonoParser.PALERROR, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(telefonoParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(telefonoParser.NUMERO, i);
		}
		public List<TerminalNode> GUION() { return getTokens(telefonoParser.GUION); }
		public TerminalNode GUION(int i) {
			return getToken(telefonoParser.GUION, i);
		}
		public List<TerminalNode> DOSNUM() { return getTokens(telefonoParser.DOSNUM); }
		public TerminalNode DOSNUM(int i) {
			return getToken(telefonoParser.DOSNUM, i);
		}
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_error);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(23);
					match(PALERROR);
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERO) {
				{
				{
				setState(29);
				match(NUMERO);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GUION) {
				{
				{
				setState(35);
				match(GUION);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PALERROR) {
				{
				{
				setState(41);
				match(PALERROR);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOSNUM) {
				{
				{
				setState(47);
				match(DOSNUM);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TelefonoContext extends ParserRuleContext {
		public LadaContext lada() {
			return getRuleContext(LadaContext.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TelefonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telefono; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterTelefono(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitTelefono(this);
		}
	}

	public final TelefonoContext telefono() throws RecognitionException {
		TelefonoContext _localctx = new TelefonoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_telefono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			lada();
			setState(54);
			cuerpo();
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

	public static class LadaContext extends ParserRuleContext {
		public TerminalNode ABRIR() { return getToken(telefonoParser.ABRIR, 0); }
		public TerminalNode NUMERO() { return getToken(telefonoParser.NUMERO, 0); }
		public TerminalNode CERRAR() { return getToken(telefonoParser.CERRAR, 0); }
		public LadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterLada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitLada(this);
		}
	}

	public final LadaContext lada() throws RecognitionException {
		LadaContext _localctx = new LadaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ABRIR);
			setState(57);
			match(NUMERO);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CERRAR) {
				{
				setState(58);
				match(CERRAR);
				}
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

	public static class CuerpoContext extends ParserRuleContext {
		public List<TerminalNode> GUION() { return getTokens(telefonoParser.GUION); }
		public TerminalNode GUION(int i) {
			return getToken(telefonoParser.GUION, i);
		}
		public List<TerminalNode> DOSNUM() { return getTokens(telefonoParser.DOSNUM); }
		public TerminalNode DOSNUM(int i) {
			return getToken(telefonoParser.DOSNUM, i);
		}
		public TerminalNode TRESNUM() { return getToken(telefonoParser.TRESNUM, 0); }
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitCuerpo(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRESNUM) {
				{
				setState(61);
				match(TRESNUM);
				}
			}

			setState(64);
			match(GUION);
			setState(65);
			match(DOSNUM);
			setState(66);
			match(GUION);
			setState(67);
			match(DOSNUM);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fH\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\5\3\26\n\3\3\3\3\3\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\7\4!\n\4\f\4\16"+
		"\4$\13\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3"+
		"\4\7\4\63\n\4\f\4\16\4\66\13\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6>\n\6\3\7\5"+
		"\7A\n\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2J\2\17\3\2\2\2"+
		"\4\25\3\2\2\2\6\34\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\f@\3\2\2\2\16\20\5"+
		"\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3"+
		"\2\2\2\23\26\5\b\5\2\24\26\5\6\4\2\25\23\3\2\2\2\25\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\30\7\t\2\2\30\5\3\2\2\2\31\33\7\n\2\2\32\31\3\2\2\2\33\36\3"+
		"\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\"\3\2\2\2\36\34\3\2\2\2\37!\7\13"+
		"\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#(\3\2\2\2$\"\3\2\2\2"+
		"%\'\7\b\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2).\3\2\2\2*(\3\2\2"+
		"\2+-\7\n\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60"+
		".\3\2\2\2\61\63\7\5\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\7\3\2\2\2\66\64\3\2\2\2\678\5\n\6\289\5\f\7\29\t\3\2\2\2:"+
		";\7\6\2\2;=\7\13\2\2<>\7\7\2\2=<\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?A\7\4\2"+
		"\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\b\2\2CD\7\5\2\2DE\7\b\2\2EF\7\5\2"+
		"\2F\r\3\2\2\2\13\21\25\34\"(.\64=@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}