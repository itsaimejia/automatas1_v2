// Generated from .\polinomio.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class polinomioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXIS=1, POTENCIA=2, DOS=3, MAS=4, NUM=5;
	public static final int
		RULE_polinomio = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"polinomio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'x'", "'^'", "'2'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EXIS", "POTENCIA", "DOS", "MAS", "NUM"
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
	public String getGrammarFileName() { return "polinomio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public polinomioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PolinomioContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(polinomioParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(polinomioParser.NUM, i);
		}
		public List<TerminalNode> EXIS() { return getTokens(polinomioParser.EXIS); }
		public TerminalNode EXIS(int i) {
			return getToken(polinomioParser.EXIS, i);
		}
		public TerminalNode POTENCIA() { return getToken(polinomioParser.POTENCIA, 0); }
		public TerminalNode DOS() { return getToken(polinomioParser.DOS, 0); }
		public List<TerminalNode> MAS() { return getTokens(polinomioParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(polinomioParser.MAS, i);
		}
		public PolinomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof polinomioListener ) ((polinomioListener)listener).enterPolinomio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof polinomioListener ) ((polinomioListener)listener).exitPolinomio(this);
		}
	}

	public final PolinomioContext polinomio() throws RecognitionException {
		PolinomioContext _localctx = new PolinomioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_polinomio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(NUM);
			setState(3);
			match(EXIS);
			setState(4);
			match(POTENCIA);
			setState(5);
			match(DOS);
			setState(6);
			match(MAS);
			setState(7);
			match(NUM);
			setState(8);
			match(EXIS);
			setState(9);
			match(MAS);
			setState(10);
			match(NUM);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\17\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\r\2\4\3\2\2\2\4"+
		"\5\7\7\2\2\5\6\7\3\2\2\6\7\7\4\2\2\7\b\7\5\2\2\b\t\7\6\2\2\t\n\7\7\2\2"+
		"\n\13\7\3\2\2\13\f\7\6\2\2\f\r\7\7\2\2\r\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}