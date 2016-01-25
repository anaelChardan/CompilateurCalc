// Generated from /Users/Ananas/Documents/FIL/IntelliJ/SELP/calc2c/src/main/java/parser/CCalc.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CCalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, OPERATOR=3, BOOLIT=4, INTLIT=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "OPERATOR", "BOOLIT", "INTLIT", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "OPERATOR", "BOOLIT", "INTLIT", "WS"
	};


	public CCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\b.\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\37\n\5\3\6\3\6\3\6\7\6$\n\6\f\6\16\6"+
		"\'\13\6\5\6)\n\6\3\7\3\7\3\7\3\7\2\b\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\2\3\2\4\4\2--//\5\2\13\f\17\17\"\"\60\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\21\3\2\2\2"+
		"\7\23\3\2\2\2\t\36\3\2\2\2\13(\3\2\2\2\r*\3\2\2\2\17\20\7*\2\2\20\4\3"+
		"\2\2\2\21\22\7+\2\2\22\6\3\2\2\2\23\24\t\2\2\2\24\b\3\2\2\2\25\26\7v\2"+
		"\2\26\27\7t\2\2\27\30\7w\2\2\30\37\7g\2\2\31\32\7h\2\2\32\33\7c\2\2\33"+
		"\34\7n\2\2\34\35\7u\2\2\35\37\7g\2\2\36\25\3\2\2\2\36\31\3\2\2\2\37\n"+
		"\3\2\2\2 )\7\62\2\2!%\4\63;\2\"$\4\62;\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&)\3\2\2\2\'%\3\2\2\2( \3\2\2\2(!\3\2\2\2)\f\3\2\2\2*+\t\3"+
		"\2\2+,\3\2\2\2,-\b\7\2\2-\16\3\2\2\2\6\2\36%(";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}