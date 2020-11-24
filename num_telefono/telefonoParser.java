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
		ABRIR=1, CERRAR=2, GUION=3, ESPACIO=4, DIGITO=5, WS=6;
	public static final int
		RULE_telefonos = 0, RULE_telefono = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"telefonos", "telefono"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABRIR", "CERRAR", "GUION", "ESPACIO", "DIGITO", "WS"
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

	public static class TelefonosContext extends ParserRuleContext {
		public List<TelefonoContext> telefono() {
			return getRuleContexts(TelefonoContext.class);
		}
		public TelefonoContext telefono(int i) {
			return getRuleContext(TelefonoContext.class,i);
		}
		public TelefonosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telefonos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterTelefonos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitTelefonos(this);
		}
	}

	public final TelefonosContext telefonos() throws RecognitionException {
		TelefonosContext _localctx = new TelefonosContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_telefonos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				telefono();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ABRIR );
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
		public TerminalNode ABRIR() { return getToken(telefonoParser.ABRIR, 0); }
		public List<TerminalNode> DIGITO() { return getTokens(telefonoParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(telefonoParser.DIGITO, i);
		}
		public TerminalNode CERRAR() { return getToken(telefonoParser.CERRAR, 0); }
		public TerminalNode ESPACIO() { return getToken(telefonoParser.ESPACIO, 0); }
		public List<TerminalNode> GUION() { return getTokens(telefonoParser.GUION); }
		public TerminalNode GUION(int i) {
			return getToken(telefonoParser.GUION, i);
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
		enterRule(_localctx, 2, RULE_telefono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(ABRIR);
			setState(10);
			match(DIGITO);
			setState(11);
			match(DIGITO);
			setState(12);
			match(DIGITO);
			setState(13);
			match(CERRAR);
			setState(14);
			match(ESPACIO);
			setState(15);
			match(DIGITO);
			setState(16);
			match(DIGITO);
			setState(17);
			match(DIGITO);
			setState(18);
			match(GUION);
			setState(19);
			match(DIGITO);
			setState(20);
			match(DIGITO);
			setState(21);
			match(GUION);
			setState(22);
			match(DIGITO);
			setState(23);
			match(DIGITO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\34\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\32\2\7\3\2\2\2\4\13\3\2\2"+
		"\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2"+
		"\2\2\13\f\7\3\2\2\f\r\7\7\2\2\r\16\7\7\2\2\16\17\7\7\2\2\17\20\7\4\2\2"+
		"\20\21\7\6\2\2\21\22\7\7\2\2\22\23\7\7\2\2\23\24\7\7\2\2\24\25\7\5\2\2"+
		"\25\26\7\7\2\2\26\27\7\7\2\2\27\30\7\5\2\2\30\31\7\7\2\2\31\32\7\7\2\2"+
		"\32\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}