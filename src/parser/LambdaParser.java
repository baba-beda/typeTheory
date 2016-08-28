// Generated from /home/baba_beda/typeTheory/Lambda.g4 by ANTLR 4.5.3

    package parser;
    import expression.*;
    import pattern.*;

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
		SPACE=1, SLASH=2, OB=3, CB=4, VAR=5, DOT=6, SQOB=7, SQCB=8, ASSIGN=9, 
		PRED=10, SUCC=11, NUMERAL=12, TRUE=13, FALSE=14, SUM=15, MUL=16, ID=17, 
		ISZERO=18;
	public static final int
		RULE_condition = 0, RULE_expression = 1, RULE_application = 2, RULE_atom = 3, 
		RULE_numeral = 4, RULE_function = 5, RULE_variable = 6;
	public static final String[] ruleNames = {
		"condition", "expression", "application", "atom", "numeral", "function", 
		"variable"
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
	public static class ConditionContext extends ParserRuleContext {
		public Condition cond;
		public ExpressionContext e1;
		public VariableContext v;
		public ExpressionContext e2;
		public TerminalNode SQOB() { return getToken(LambdaParser.SQOB, 0); }
		public TerminalNode ASSIGN() { return getToken(LambdaParser.ASSIGN, 0); }
		public TerminalNode SQCB() { return getToken(LambdaParser.SQCB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(LambdaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(LambdaParser.SPACE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((ConditionContext)_localctx).e1 = expression();
			setState(17);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(15);
				match(SPACE);
				}
				break;
			case SQOB:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(19);
			match(SQOB);
			setState(22);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(20);
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
			setState(24);
			((ConditionContext)_localctx).v = variable();
			setState(27);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(25);
				match(SPACE);
				}
				break;
			case ASSIGN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(29);
			match(ASSIGN);
			setState(32);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(30);
				match(SPACE);
				}
				break;
			case SLASH:
			case OB:
			case VAR:
			case PRED:
			case SUCC:
			case NUMERAL:
			case TRUE:
			case FALSE:
			case SUM:
			case MUL:
			case ID:
			case ISZERO:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(34);
			((ConditionContext)_localctx).e2 = expression();
			setState(35);
			match(SQCB);
			((ConditionContext)_localctx).cond =  new Condition(((ConditionContext)_localctx).e1.value, ((ConditionContext)_localctx).v.value, ((ConditionContext)_localctx).e2.value);
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
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((ExpressionContext)_localctx).a1 = application(0);
				setState(39);
				match(SPACE);
				setState(40);
				match(SLASH);
				setState(43);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(41);
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
				setState(45);
				((ExpressionContext)_localctx).v1 = variable();
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(48);
					switch (_input.LA(1)) {
					case SPACE:
						{
						setState(46);
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
				setState(53);
				match(DOT);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(56);
					switch (_input.LA(1)) {
					case SPACE:
						{
						setState(54);
						match(SPACE);
						}
						break;
					case SLASH:
					case OB:
					case VAR:
					case PRED:
					case SUCC:
					case NUMERAL:
					case TRUE:
					case FALSE:
					case SUM:
					case MUL:
					case ID:
					case ISZERO:
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
				setState(61);
				((ExpressionContext)_localctx).e1 = expression();
				((ExpressionContext)_localctx).value =  new Application(((ExpressionContext)_localctx).a1.value, new LambdaExpression(((ExpressionContext)_localctx).v1.value, ((ExpressionContext)_localctx).e1.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(SLASH);
				setState(67);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(65);
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
				setState(69);
				((ExpressionContext)_localctx).v2 = variable();
				setState(72);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(70);
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
				setState(74);
				match(DOT);
				setState(77);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(75);
					match(SPACE);
					}
					break;
				case SLASH:
				case OB:
				case VAR:
				case PRED:
				case SUCC:
				case NUMERAL:
				case TRUE:
				case FALSE:
				case SUM:
				case MUL:
				case ID:
				case ISZERO:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79);
				((ExpressionContext)_localctx).e2 = expression();
				((ExpressionContext)_localctx).value =  new LambdaExpression(((ExpressionContext)_localctx).v2.value, ((ExpressionContext)_localctx).e2.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_application, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			((ApplicationContext)_localctx).at2 = atom();
			((ApplicationContext)_localctx).value =  ((ApplicationContext)_localctx).at2.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					setState(91);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(92);
					match(SPACE);
					setState(93);
					((ApplicationContext)_localctx).at1 = atom();
					((ApplicationContext)_localctx).value =  new Application(((ApplicationContext)_localctx).a1.value, ((ApplicationContext)_localctx).at1.value);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public FunctionContext f;
		public VariableContext v;
		public NumeralContext n;
		public TerminalNode OB() { return getToken(LambdaParser.OB, 0); }
		public TerminalNode CB() { return getToken(LambdaParser.CB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
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
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case OB:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(OB);
				setState(102);
				((AtomContext)_localctx).e = expression();
				setState(103);
				match(CB);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).e.value;
				}
				break;
			case PRED:
			case SUCC:
			case TRUE:
			case FALSE:
			case SUM:
			case MUL:
			case ID:
			case ISZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((AtomContext)_localctx).f = function();
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).f.value;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				((AtomContext)_localctx).v = variable();
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).v.value;
				}
				break;
			case NUMERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				((AtomContext)_localctx).n = numeral();
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).n.value;
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

	public static class NumeralContext extends ParserRuleContext {
		public Numeral value;
		public Token NUMERAL;
		public TerminalNode NUMERAL() { return getToken(LambdaParser.NUMERAL, 0); }
		public NumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitNumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeralContext numeral() throws RecognitionException {
		NumeralContext _localctx = new NumeralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numeral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((NumeralContext)_localctx).NUMERAL = match(NUMERAL);
			((NumeralContext)_localctx).value =  new Numeral(Integer.parseInt((((NumeralContext)_localctx).NUMERAL!=null?((NumeralContext)_localctx).NUMERAL.getText():null)));
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

	public static class FunctionContext extends ParserRuleContext {
		public Pattern value;
		public TerminalNode PRED() { return getToken(LambdaParser.PRED, 0); }
		public TerminalNode SUCC() { return getToken(LambdaParser.SUCC, 0); }
		public TerminalNode TRUE() { return getToken(LambdaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LambdaParser.FALSE, 0); }
		public TerminalNode SUM() { return getToken(LambdaParser.SUM, 0); }
		public TerminalNode MUL() { return getToken(LambdaParser.MUL, 0); }
		public TerminalNode ID() { return getToken(LambdaParser.ID, 0); }
		public TerminalNode ISZERO() { return getToken(LambdaParser.ISZERO, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LambdaVisitor ) return ((LambdaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case PRED:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(PRED);
				((FunctionContext)_localctx).value =  new Pred();
				}
				break;
			case SUCC:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(SUCC);
				((FunctionContext)_localctx).value =  new Succ();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(TRUE);
				((FunctionContext)_localctx).value =  new True();
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(FALSE);
				((FunctionContext)_localctx).value =  new False();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(SUM);
				((FunctionContext)_localctx).value =  new Sum();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(MUL);
				((FunctionContext)_localctx).value =  new Mul();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				match(ID);
				((FunctionContext)_localctx).value =  new IdentityFunction();
				}
				break;
			case ISZERO:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				match(ISZERO);
				((FunctionContext)_localctx).value =  new IsZero();
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
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		case 2:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\5\2\24\n"+
		"\2\3\2\3\2\3\2\5\2\31\n\2\3\2\3\2\3\2\5\2\36\n\2\3\2\3\2\3\2\5\2#\n\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\3\5\3\66\n\3\3\3\3\3\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3F\n\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4c\n\4\f\4\16"+
		"\4f\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5v"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\2\3\6\t\2\4\6\b\n\f\16\2\2\u00a1"+
		"\2\20\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bu\3\2\2\2\nw\3\2\2\2\f\u008a\3\2"+
		"\2\2\16\u008c\3\2\2\2\20\23\5\4\3\2\21\24\7\3\2\2\22\24\3\2\2\2\23\21"+
		"\3\2\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\30\7\t\2\2\26\31\7\3\2\2\27\31"+
		"\3\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\35\5\16\b\2\33\36"+
		"\7\3\2\2\34\36\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\""+
		"\7\13\2\2 #\7\3\2\2!#\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$%\5\4\3"+
		"\2%&\7\n\2\2&\'\b\2\1\2\'\3\3\2\2\2()\5\6\4\2)*\7\3\2\2*-\7\4\2\2+.\7"+
		"\3\2\2,.\3\2\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\65\5\16\b\2\60\63\7\3"+
		"\2\2\61\63\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\66\3\2"+
		"\2\2\65\62\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67=\7\b\2\28;\7\3\2\29"+
		";\3\2\2\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<>\3\2\2\2=:\3\2\2\2=<\3\2\2\2"+
		">?\3\2\2\2?@\5\4\3\2@A\b\3\1\2AX\3\2\2\2BE\7\4\2\2CF\7\3\2\2DF\3\2\2\2"+
		"EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GJ\5\16\b\2HK\7\3\2\2IK\3\2\2\2JH\3\2\2"+
		"\2JI\3\2\2\2KL\3\2\2\2LO\7\b\2\2MP\7\3\2\2NP\3\2\2\2OM\3\2\2\2ON\3\2\2"+
		"\2PQ\3\2\2\2QR\5\4\3\2RS\b\3\1\2SX\3\2\2\2TU\5\6\4\2UV\b\3\1\2VX\3\2\2"+
		"\2W(\3\2\2\2WB\3\2\2\2WT\3\2\2\2X\5\3\2\2\2YZ\b\4\1\2Z[\5\b\5\2[\\\b\4"+
		"\1\2\\d\3\2\2\2]^\f\4\2\2^_\7\3\2\2_`\5\b\5\2`a\b\4\1\2ac\3\2\2\2b]\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\7\3\2\2\2fd\3\2\2\2gh\7\5\2\2hi"+
		"\5\4\3\2ij\7\6\2\2jk\b\5\1\2kv\3\2\2\2lm\5\f\7\2mn\b\5\1\2nv\3\2\2\2o"+
		"p\5\16\b\2pq\b\5\1\2qv\3\2\2\2rs\5\n\6\2st\b\5\1\2tv\3\2\2\2ug\3\2\2\2"+
		"ul\3\2\2\2uo\3\2\2\2ur\3\2\2\2v\t\3\2\2\2wx\7\16\2\2xy\b\6\1\2y\13\3\2"+
		"\2\2z{\7\f\2\2{\u008b\b\7\1\2|}\7\r\2\2}\u008b\b\7\1\2~\177\7\17\2\2\177"+
		"\u008b\b\7\1\2\u0080\u0081\7\20\2\2\u0081\u008b\b\7\1\2\u0082\u0083\7"+
		"\21\2\2\u0083\u008b\b\7\1\2\u0084\u0085\7\22\2\2\u0085\u008b\b\7\1\2\u0086"+
		"\u0087\7\23\2\2\u0087\u008b\b\7\1\2\u0088\u0089\7\24\2\2\u0089\u008b\b"+
		"\7\1\2\u008az\3\2\2\2\u008a|\3\2\2\2\u008a~\3\2\2\2\u008a\u0080\3\2\2"+
		"\2\u008a\u0082\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\r\3\2\2\2\u008c\u008d\7\7\2\2\u008d\u008e\b\b\1\2\u008e"+
		"\17\3\2\2\2\22\23\30\35\"-\62\65:=EJOWdu\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}