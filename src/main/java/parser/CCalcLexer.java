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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, INTLIT=19, BOOLIT=20, VARIABLE=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'=>'", "')'", "'+'", "'*'", "'-'", "':'", "'('", "'<'", "'='", "'!='", 
		"'<='", "'&&'", "'?'", "'||'", "'>'", "'=='", "'/'", "'!'", "INTLIT", 
		"BOOLIT", "VARIABLE", "WS"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INTLIT", "BOOLIT", "VARIABLE", "WS"
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
		case 21: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24]\n\24\f\24\16\24`\13\24"+
		"\5\24b\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25m\n\25\3"+
		"\26\3\26\7\26q\n\26\f\26\16\26t\13\26\3\27\3\27\3\27\3\27\2\30\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\2"+
		"\3\2\4\4\2\62;c|\5\2\13\f\17\17\"\"|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t\66\3"+
		"\2\2\2\138\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B"+
		"\3\2\2\2\27E\3\2\2\2\31H\3\2\2\2\33K\3\2\2\2\35M\3\2\2\2\37P\3\2\2\2!"+
		"R\3\2\2\2#U\3\2\2\2%W\3\2\2\2\'a\3\2\2\2)l\3\2\2\2+n\3\2\2\2-u\3\2\2\2"+
		"/\60\7?\2\2\60\61\7@\2\2\61\4\3\2\2\2\62\63\7+\2\2\63\6\3\2\2\2\64\65"+
		"\7-\2\2\65\b\3\2\2\2\66\67\7,\2\2\67\n\3\2\2\289\7/\2\29\f\3\2\2\2:;\7"+
		"<\2\2;\16\3\2\2\2<=\7*\2\2=\20\3\2\2\2>?\7>\2\2?\22\3\2\2\2@A\7?\2\2A"+
		"\24\3\2\2\2BC\7#\2\2CD\7?\2\2D\26\3\2\2\2EF\7>\2\2FG\7?\2\2G\30\3\2\2"+
		"\2HI\7(\2\2IJ\7(\2\2J\32\3\2\2\2KL\7A\2\2L\34\3\2\2\2MN\7~\2\2NO\7~\2"+
		"\2O\36\3\2\2\2PQ\7@\2\2Q \3\2\2\2RS\7?\2\2ST\7?\2\2T\"\3\2\2\2UV\7\61"+
		"\2\2V$\3\2\2\2WX\7#\2\2X&\3\2\2\2Yb\7\62\2\2Z^\4\63;\2[]\4\62;\2\\[\3"+
		"\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2aZ"+
		"\3\2\2\2b(\3\2\2\2cd\7v\2\2de\7t\2\2ef\7w\2\2fm\7g\2\2gh\7h\2\2hi\7c\2"+
		"\2ij\7n\2\2jk\7u\2\2km\7g\2\2lc\3\2\2\2lg\3\2\2\2m*\3\2\2\2nr\4c|\2oq"+
		"\t\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s,\3\2\2\2tr\3\2\2\2u"+
		"v\t\3\2\2vw\3\2\2\2wx\b\27\2\2x.\3\2\2\2\7\2^alr";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}