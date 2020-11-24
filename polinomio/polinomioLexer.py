# Generated from .\polinomio.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7")
        buf.write("\32\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3")
        buf.write("\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6\27\n\6\r\6\16\6\30")
        buf.write("\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\3\3\2\62;\2\32\2\3\3\2")
        buf.write("\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2")
        buf.write("\3\r\3\2\2\2\5\17\3\2\2\2\7\21\3\2\2\2\t\23\3\2\2\2\13")
        buf.write("\26\3\2\2\2\r\16\7z\2\2\16\4\3\2\2\2\17\20\7`\2\2\20\6")
        buf.write("\3\2\2\2\21\22\7\64\2\2\22\b\3\2\2\2\23\24\7-\2\2\24\n")
        buf.write("\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30")
        buf.write("\26\3\2\2\2\30\31\3\2\2\2\31\f\3\2\2\2\4\2\30\2")
        return buf.getvalue()


class polinomioLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    EXIS = 1
    POTENCIA = 2
    DOS = 3
    MAS = 4
    NUM = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'x'", "'^'", "'2'", "'+'" ]

    symbolicNames = [ "<INVALID>",
            "EXIS", "POTENCIA", "DOS", "MAS", "NUM" ]

    ruleNames = [ "EXIS", "POTENCIA", "DOS", "MAS", "NUM" ]

    grammarFileName = "polinomio.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


