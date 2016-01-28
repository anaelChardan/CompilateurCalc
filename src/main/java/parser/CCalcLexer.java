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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, INTLIT=16, BOOLIT=17, 
		MINUS=18, NOT=19, OP=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'=>'", "')'", "'+'", "'*'", "':'", "'('", "'<'", "'!='", "'<='", "'&&'", 
		"'?'", "'||'", "'>'", "'=='", "'/'", "INTLIT", "BOOLIT", "'-'", "'!'", 
		"OP", "WS"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INTLIT", "BOOLIT", "MINUS", 
		"NOT", "OP", "WS"
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
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\7\21U\n\21\f\21\16\21X\13\21\5\21Z\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22e\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"o\n\25\3\26\3\26\3\26\3\26\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\23\1%\24\1\'\25\1)\26\1+\27\2\3\2\4\4\2,-\61\61\5\2\13\f\17\17\"\""+
		"x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2"+
		"\2\2\7\62\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21"+
		"<\3\2\2\2\23?\3\2\2\2\25B\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33J\3\2\2\2"+
		"\35L\3\2\2\2\37O\3\2\2\2!Y\3\2\2\2#d\3\2\2\2%f\3\2\2\2\'h\3\2\2\2)n\3"+
		"\2\2\2+p\3\2\2\2-.\7?\2\2./\7@\2\2/\4\3\2\2\2\60\61\7+\2\2\61\6\3\2\2"+
		"\2\62\63\7-\2\2\63\b\3\2\2\2\64\65\7,\2\2\65\n\3\2\2\2\66\67\7<\2\2\67"+
		"\f\3\2\2\289\7*\2\29\16\3\2\2\2:;\7>\2\2;\20\3\2\2\2<=\7#\2\2=>\7?\2\2"+
		">\22\3\2\2\2?@\7>\2\2@A\7?\2\2A\24\3\2\2\2BC\7(\2\2CD\7(\2\2D\26\3\2\2"+
		"\2EF\7A\2\2F\30\3\2\2\2GH\7~\2\2HI\7~\2\2I\32\3\2\2\2JK\7@\2\2K\34\3\2"+
		"\2\2LM\7?\2\2MN\7?\2\2N\36\3\2\2\2OP\7\61\2\2P \3\2\2\2QZ\7\62\2\2RV\4"+
		"\63;\2SU\4\62;\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2YQ\3\2\2\2YR\3\2\2\2Z\"\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^e\7"+
		"g\2\2_`\7h\2\2`a\7c\2\2ab\7n\2\2bc\7u\2\2ce\7g\2\2d[\3\2\2\2d_\3\2\2\2"+
		"e$\3\2\2\2fg\7/\2\2g&\3\2\2\2hi\7#\2\2i(\3\2\2\2jo\t\2\2\2kl\7?\2\2lo"+
		"\7?\2\2mo\7>\2\2nj\3\2\2\2nk\3\2\2\2nm\3\2\2\2o*\3\2\2\2pq\t\3\2\2qr\3"+
		"\2\2\2rs\b\26\2\2s,\3\2\2\2\7\2VYdn";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}