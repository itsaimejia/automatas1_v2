# Generated from .\polinomio.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7")
        buf.write("\17\4\2\t\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3")
        buf.write("\2\2\2\3\2\2\2\2\r\2\4\3\2\2\2\4\5\7\7\2\2\5\6\7\3\2\2")
        buf.write("\6\7\7\4\2\2\7\b\7\5\2\2\b\t\7\6\2\2\t\n\7\7\2\2\n\13")
        buf.write("\7\3\2\2\13\f\7\6\2\2\f\r\7\7\2\2\r\3\3\2\2\2\2")
        return buf.getvalue()


class polinomioParser ( Parser ):

    grammarFileName = "polinomio.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'x'", "'^'", "'2'", "'+'" ]

    symbolicNames = [ "<INVALID>", "EXIS", "POTENCIA", "DOS", "MAS", "NUM" ]

    RULE_polinomio = 0

    ruleNames =  [ "polinomio" ]

    EOF = Token.EOF
    EXIS=1
    POTENCIA=2
    DOS=3
    MAS=4
    NUM=5

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class PolinomioContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(polinomioParser.NUM)
            else:
                return self.getToken(polinomioParser.NUM, i)

        def EXIS(self, i:int=None):
            if i is None:
                return self.getTokens(polinomioParser.EXIS)
            else:
                return self.getToken(polinomioParser.EXIS, i)

        def POTENCIA(self):
            return self.getToken(polinomioParser.POTENCIA, 0)

        def DOS(self):
            return self.getToken(polinomioParser.DOS, 0)

        def MAS(self, i:int=None):
            if i is None:
                return self.getTokens(polinomioParser.MAS)
            else:
                return self.getToken(polinomioParser.MAS, i)

        def getRuleIndex(self):
            return polinomioParser.RULE_polinomio

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPolinomio" ):
                listener.enterPolinomio(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPolinomio" ):
                listener.exitPolinomio(self)




    def polinomio(self):

        localctx = polinomioParser.PolinomioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_polinomio)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(polinomioParser.NUM)
            self.state = 3
            self.match(polinomioParser.EXIS)
            self.state = 4
            self.match(polinomioParser.POTENCIA)
            self.state = 5
            self.match(polinomioParser.DOS)
            self.state = 6
            self.match(polinomioParser.MAS)
            self.state = 7
            self.match(polinomioParser.NUM)
            self.state = 8
            self.match(polinomioParser.EXIS)
            self.state = 9
            self.match(polinomioParser.MAS)
            self.state = 10
            self.match(polinomioParser.NUM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





