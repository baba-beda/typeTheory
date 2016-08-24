// Generated from /home/baba_beda/typeTheory/Lambda.g4 by ANTLR 4.5.3

    package parser;
    import expression.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LambdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SLASH=2, OB=3, CB=4, VAR=5, DOT=6;
	public static final int
		RULE_expression = 0, RULE_application = 1, RULE_atom = 2, RULE_variable = 3;
	public static final String[] ruleNames = {
		"expression", "application", "atom", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'\\'", "'('", "')'", null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SLASH", "OB", "CB", "VAR", "DOT"
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

	@Override
	public String getGrammarFileName() { return "Lambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LambdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public Expression value;
		public ApplicationContext a1;
		public VariableContext v1;
		public ExpressionContext e1;
		public VariableContext v2;
		public ExpressionContext e2;
		public ApplicationContext a2;
		public List<TerminalNode> SPACE() { return getTokens(LambdaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(LambdaParser.SPACE, i);
		}
		public TerminalNode SLASH() { return getToken(LambdaParser.SLASH, 0); }
		public TerminalNode DOT() { return getToken(LambdaParser.DOT, 0); }
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				((ExpressionContext)_localctx).a1 = application(0);
				setState(9);
				match(SPACE);
				setState(10);
				match(SLASH);
				setState(13);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(11);
					match(SPACE);
					}
					break;
				case VAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15);
				((ExpressionContext)_localctx).v1 = variable();
				setState(21);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(18);
					switch (_input.LA(1)) {
					case SPACE:
						{
						setState(16);
						match(SPACE);
						}
						break;
					case DOT:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					}
					break;
				}
				setState(23);
				match(DOT);
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(26);
					switch (_input.LA(1)) {
					case SPACE:
						{
						setState(24);
						match(SPACE);
						}
						break;
					case SLASH:
					case OB:
					case VAR:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					}
					break;
				}
				setState(31);
				((ExpressionContext)_localctx).e1 = expression();
				((ExpressionContext)_localctx).value =  new Application(((ExpressionContext)_localctx).a1.value, new LambdaExpression(((ExpressionContext)_localctx).v1.value, ((ExpressionContext)_localctx).e1.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(SLASH);
				setState(37);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(35);
					match(SPACE);
					}
					break;
				case VAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39);
				((ExpressionContext)_localctx).v2 = variable();
				setState(42);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(40);
					match(SPACE);
					}
					break;
				case DOT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44);
				match(DOT);
				setState(47);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(45);
					match(SPACE);
					}
					break;
				case SLASH:
				case OB:
				case VAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49);
				((ExpressionContext)_localctx).e2 = expression();
				((ExpressionContext)_localctx).value =  new LambdaExpression(((ExpressionContext)_localctx).v2.value, ((ExpressionContext)_localctx).e2.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				((ExpressionContext)_localctx).a2 = application(0);
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).a2.value;
				}
				break;
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

	public static class ApplicationContext extends ParserRuleContext {
		public Expression value;
		public ApplicationContext a1;
		public AtomContext at2;
		public AtomContext at1;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(LambdaParser.SPACE, 0); }
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		return application(0);
	}

	private ApplicationContext application(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ApplicationContext _localctx = new ApplicationContext(_ctx, _parentState);
		ApplicationContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_application, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			((ApplicationContext)_localctx).at2 = atom();
			((ApplicationContext)_localctx).value =  ((ApplicationContext)_localctx).at2.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ApplicationContext(_parentctx, _parentState);
					_localctx.a1 = _prevctx;
					_localctx.a1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_application);
					setState(61);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(62);
					match(SPACE);
					setState(63);
					((ApplicationContext)_localctx).at1 = atom();
					((ApplicationContext)_localctx).value =  new Application(((ApplicationContext)_localctx).a1.value, ((ApplicationContext)_localctx).at1.value);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public Expression value;
		public ExpressionContext e;
		public VariableContext v;
		public TerminalNode OB() { return getToken(LambdaParser.OB, 0); }
		public TerminalNode CB() { return getToken(LambdaParser.CB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case OB:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(OB);
				setState(72);
				((AtomContext)_localctx).e = expression();
				setState(73);
				match(CB);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).e.value;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((AtomContext)_localctx).v = variable();
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).v.value;
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

	public static class VariableContext extends ParserRuleContext {
		public Variable value;
		public Token VAR;
		public TerminalNode VAR() { return getToken(LambdaParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((VariableContext)_localctx).VAR = match(VAR);
			((VariableContext)_localctx).value =  new Variable((((VariableContext)_localctx).VAR!=null?((VariableContext)_localctx).VAR.getText():null));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return application_sempred((ApplicationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean application_sempred(ApplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\bW\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\5\2\20\n\2\3\2\3\2\3\2\5\2\25\n"+
		"\2\3\2\5\2\30\n\2\3\2\3\2\3\2\5\2\35\n\2\3\2\5\2 \n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2(\n\2\3\2\3\2\3\2\5\2-\n\2\3\2\3\2\3\2\5\2\62\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3E\n\3"+
		"\f\3\16\3H\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\5\3\5\3\5\3"+
		"\5\2\3\4\6\2\4\6\b\2\2^\29\3\2\2\2\4;\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\n"+
		"\13\5\4\3\2\13\f\7\3\2\2\f\17\7\4\2\2\r\20\7\3\2\2\16\20\3\2\2\2\17\r"+
		"\3\2\2\2\17\16\3\2\2\2\20\21\3\2\2\2\21\27\5\b\5\2\22\25\7\3\2\2\23\25"+
		"\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\30\3\2\2\2\27\24"+
		"\3\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\37\7\b\2\2\32\35\7\3\2\2\33\35"+
		"\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36 \3\2\2\2\37\34\3\2"+
		"\2\2\37\36\3\2\2\2 !\3\2\2\2!\"\5\2\2\2\"#\b\2\1\2#:\3\2\2\2$\'\7\4\2"+
		"\2%(\7\3\2\2&(\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2\2),\5\b\5\2*-\7\3"+
		"\2\2+-\3\2\2\2,*\3\2\2\2,+\3\2\2\2-.\3\2\2\2.\61\7\b\2\2/\62\7\3\2\2\60"+
		"\62\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\64\5\2\2\2\64\65"+
		"\b\2\1\2\65:\3\2\2\2\66\67\5\4\3\2\678\b\2\1\28:\3\2\2\29\n\3\2\2\29$"+
		"\3\2\2\29\66\3\2\2\2:\3\3\2\2\2;<\b\3\1\2<=\5\6\4\2=>\b\3\1\2>F\3\2\2"+
		"\2?@\f\4\2\2@A\7\3\2\2AB\5\6\4\2BC\b\3\1\2CE\3\2\2\2D?\3\2\2\2EH\3\2\2"+
		"\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HF\3\2\2\2IJ\7\5\2\2JK\5\2\2\2KL\7\6"+
		"\2\2LM\b\4\1\2MR\3\2\2\2NO\5\b\5\2OP\b\4\1\2PR\3\2\2\2QI\3\2\2\2QN\3\2"+
		"\2\2R\7\3\2\2\2ST\7\7\2\2TU\b\5\1\2U\t\3\2\2\2\r\17\24\27\34\37\',\61"+
		"9FQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}