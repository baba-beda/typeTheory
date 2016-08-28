// Generated from /home/baba_beda/typeTheory/Lambda.g4 by ANTLR 4.5.3

    package parser;
    import expression.*;
    import pattern.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LambdaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SLASH=2, OB=3, CB=4, VAR=5, DOT=6, SQOB=7, SQCB=8, ASSIGN=9, 
		PRED=10, SUCC=11, NUMERAL=12, TRUE=13, FALSE=14, SUM=15, MUL=16, ID=17, 
		ISZERO=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "SLASH", "OB", "CB", "VAR", "DOT", "SQOB", "SQCB", "ASSIGN", 
		"PRED", "SUCC", "NUMERAL", "TRUE", "FALSE", "SUM", "MUL", "ID", "ISZERO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'\\'", "'('", "')'", null, "'.'", "'['", "']'", "':='", "'PRED'", 
		"'SUCC'", null, "'TRUE'", "'FALSE'", "'SUM'", "'MUL'", "'ID'", "'IS0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SLASH", "OB", "CB", "VAR", "DOT", "SQOB", "SQCB", "ASSIGN", 
		"PRED", "SUCC", "NUMERAL", "TRUE", "FALSE", "SUM", "MUL", "ID", "ISZERO"
	};
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


	public LambdaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6"+
		"\65\n\6\f\6\16\68\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\rO\n\r\3\r\3\r\7\rS\n\r\f"+
		"\r\16\rV\13\r\3\r\5\rY\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\5\2\13\f\17\17\"\"\3\2c|"+
		"\6\2))\62;aac|\3\2\63;\3\2\62;x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3(\3\2\2\2\5,\3\2\2\2\7"+
		".\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2"+
		"\2\23?\3\2\2\2\25B\3\2\2\2\27G\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35_\3\2"+
		"\2\2\37e\3\2\2\2!i\3\2\2\2#m\3\2\2\2%p\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)"+
		"*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\4\3\2\2\2,-\7^\2\2-\6\3\2\2\2./\7*\2\2"+
		"/\b\3\2\2\2\60\61\7+\2\2\61\n\3\2\2\2\62\66\t\3\2\2\63\65\t\4\2\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\f\3\2\2\28\66\3\2"+
		"\2\29:\7\60\2\2:\16\3\2\2\2;<\7]\2\2<\20\3\2\2\2=>\7_\2\2>\22\3\2\2\2"+
		"?@\7<\2\2@A\7?\2\2A\24\3\2\2\2BC\7R\2\2CD\7T\2\2DE\7G\2\2EF\7F\2\2F\26"+
		"\3\2\2\2GH\7U\2\2HI\7W\2\2IJ\7E\2\2JK\7E\2\2K\30\3\2\2\2LO\7/\2\2MO\3"+
		"\2\2\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PT\t\5\2\2QS\t\6\2\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2\2\2VT\3\2\2\2WY\7\62\2\2XN\3\2\2\2XW"+
		"\3\2\2\2Y\32\3\2\2\2Z[\7V\2\2[\\\7T\2\2\\]\7W\2\2]^\7G\2\2^\34\3\2\2\2"+
		"_`\7H\2\2`a\7C\2\2ab\7N\2\2bc\7U\2\2cd\7G\2\2d\36\3\2\2\2ef\7U\2\2fg\7"+
		"W\2\2gh\7O\2\2h \3\2\2\2ij\7O\2\2jk\7W\2\2kl\7N\2\2l\"\3\2\2\2mn\7K\2"+
		"\2no\7F\2\2o$\3\2\2\2pq\7K\2\2qr\7U\2\2rs\7\62\2\2s&\3\2\2\2\t\2*\64\66"+
		"NTX\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}