// Generated from C:/Users/dongh/Desktop/LS Proj/COS382 P02 (Goeman, Ha)/src\SurveyGenerator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SurveyGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NL=19, TEXT=20, INTEGER=21, NUMBER=22, WS=23;
	public static final int
		RULE_s = 0, RULE_title = 1, RULE_page = 2, RULE_qtype = 3, RULE_question = 4, 
		RULE_subquestion = 5, RULE_multi = 6, RULE_single = 7, RULE_textentry = 8, 
		RULE_number = 9, RULE_date = 10, RULE_upload = 11, RULE_scale = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "title", "page", "qtype", "question", "subquestion", "multi", "single", 
			"textentry", "number", "date", "upload", "scale"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'~'", "'?'", "'\t?'", "'\t'", "'multi'", "'%'", "'['", 
			"','", "']'", "'>'", "'single'", "'textentry['", "'number['", "'|'", 
			"'date[]'", "'upload['", "'scale['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NL", "TEXT", "INTEGER", "NUMBER", 
			"WS"
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
	public String getGrammarFileName() { return "SurveyGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SurveyGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(26);
			match(T__0);
			setState(27);
			title();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(28);
				match(NL);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				page();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TEXT);
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41);
			match(T__1);
			setState(42);
			match(TEXT);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(43);
				match(NL);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				question();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class QtypeContext extends ParserRuleContext {
		public MultiContext multi() {
			return getRuleContext(MultiContext.class,0);
		}
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public TextentryContext textentry() {
			return getRuleContext(TextentryContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public UploadContext upload() {
			return getRuleContext(UploadContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public QtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterQtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitQtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitQtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtypeContext qtype() throws RecognitionException {
		QtypeContext _localctx = new QtypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qtype);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				multi();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				single();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				textentry();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				number();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				date();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				upload();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				scale();
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public QtypeContext qtype() {
			return getRuleContext(QtypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__2);
			setState(64);
			match(TEXT);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(NL);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(70);
			qtype();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(71);
				match(NL);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SubquestionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public QtypeContext qtype() {
			return getRuleContext(QtypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public SubquestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterSubquestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitSubquestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitSubquestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubquestionContext subquestion() throws RecognitionException {
		SubquestionContext _localctx = new SubquestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subquestion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__3);
			setState(78);
			match(TEXT);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				match(NL);
				setState(80);
				match(T__4);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(85);
			qtype();
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MultiContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(SurveyGeneratorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SurveyGeneratorParser.TEXT, i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public List<SubquestionContext> subquestion() {
			return getRuleContexts(SubquestionContext.class);
		}
		public SubquestionContext subquestion(int i) {
			return getRuleContext(SubquestionContext.class,i);
		}
		public MultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiContext multi() throws RecognitionException {
		MultiContext _localctx = new MultiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(92);
				match(T__6);
				}
			}

			setState(95);
			match(T__7);
			setState(96);
			match(TEXT);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(T__8);
				setState(98);
				match(TEXT);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(103);
			match(T__9);
			setState(104);
			match(NL);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(105);
				match(T__10);
				setState(106);
				match(TEXT);
				setState(107);
				match(NL);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					subquestion();
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				}
			}

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

	public static class SingleContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(SurveyGeneratorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SurveyGeneratorParser.TEXT, i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public List<SubquestionContext> subquestion() {
			return getRuleContexts(SubquestionContext.class);
		}
		public SubquestionContext subquestion(int i) {
			return getRuleContext(SubquestionContext.class,i);
		}
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_single);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__11);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(116);
				match(T__6);
				}
			}

			setState(119);
			match(T__7);
			setState(120);
			match(TEXT);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(T__8);
				setState(122);
				match(TEXT);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(127);
			match(T__9);
			setState(128);
			match(NL);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(129);
				match(T__10);
				setState(130);
				match(TEXT);
				setState(131);
				match(NL);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					subquestion();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				}
			}

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

	public static class TextentryContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParser.INTEGER, 0); }
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public TextentryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textentry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterTextentry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitTextentry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitTextentry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextentryContext textentry() throws RecognitionException {
		TextentryContext _localctx = new TextentryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textentry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__12);
			setState(140);
			match(INTEGER);
			setState(141);
			match(T__9);
			setState(142);
			match(NL);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(SurveyGeneratorParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SurveyGeneratorParser.INTEGER, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__13);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(145);
				match(INTEGER);
				setState(146);
				match(T__14);
				setState(147);
				match(INTEGER);
				}
			}

			setState(150);
			match(T__9);
			setState(151);
			match(NL);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__15);
			setState(154);
			match(NL);
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

	public static class UploadContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public UploadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterUpload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitUpload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitUpload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UploadContext upload() throws RecognitionException {
		UploadContext _localctx = new UploadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_upload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__16);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(157);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(158);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(159);
				match(INTEGER);
				setState(160);
				match(T__14);
				setState(161);
				match(TEXT);
				}
				break;
			}
			setState(164);
			match(T__9);
			setState(165);
			match(NL);
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

	public static class ScaleContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(SurveyGeneratorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SurveyGeneratorParser.TEXT, i);
		}
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__17);
			setState(168);
			match(TEXT);
			setState(169);
			match(T__14);
			setState(170);
			match(TEXT);
			setState(171);
			match(T__9);
			setState(172);
			match(NL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3"+
		"\4\6\4\65\n\4\r\4\16\4\66\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6"+
		"\3\6\6\6E\n\6\r\6\16\6F\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\7\3"+
		"\7\6\7T\n\7\r\7\16\7U\3\7\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\5\b`\n\b\3\b"+
		"\3\b\3\b\3\b\6\bf\n\b\r\b\16\bg\3\b\3\b\3\b\3\b\3\b\3\b\6\bp\n\b\r\b\16"+
		"\bq\5\bt\n\b\3\t\3\t\5\tx\n\t\3\t\3\t\3\t\3\t\6\t~\n\t\r\t\16\t\177\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\6\t\u0088\n\t\r\t\16\t\u0089\5\t\u008c\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\2\2\u00bd\2\34\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2"+
		"\fO\3\2\2\2\16]\3\2\2\2\20u\3\2\2\2\22\u008d\3\2\2\2\24\u0092\3\2\2\2"+
		"\26\u009b\3\2\2\2\30\u009e\3\2\2\2\32\u00a9\3\2\2\2\34\35\7\3\2\2\35!"+
		"\5\4\3\2\36 \7\25\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"%\3\2\2\2#!\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2(\3\3\2\2\2)*\7\26\2\2*\5\3\2\2\2+,\7\4\2\2,\60\7\26\2\2-/\7\25\2\2"+
		".-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\63\65\5\n\6\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\7\3\2\2\28@\5\16\b\29@\5\20\t\2:@\5\22\n\2;@\5\24\13\2<@\5\26"+
		"\f\2=@\5\30\r\2>@\5\32\16\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<"+
		"\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\t\3\2\2\2AB\7\5\2\2BD\7\26\2\2CE\7\25\2"+
		"\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HL\5\b\5\2IK\7\25"+
		"\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NL\3\2\2\2OP\7"+
		"\6\2\2PS\7\26\2\2QR\7\25\2\2RT\7\7\2\2SQ\3\2\2\2TU\3\2\2\2US\3\2\2\2U"+
		"V\3\2\2\2VW\3\2\2\2WY\5\b\5\2XZ\7\25\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\\r\3\2\2\2]_\7\b\2\2^`\7\t\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2ab\7\n\2\2be\7\26\2\2cd\7\13\2\2df\7\26\2\2ec\3\2\2\2fg\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\f\2\2js\7\25\2\2kl\7\r\2\2lm\7\26\2\2"+
		"mo\7\25\2\2np\5\f\7\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2"+
		"\2sk\3\2\2\2st\3\2\2\2t\17\3\2\2\2uw\7\16\2\2vx\7\t\2\2wv\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2yz\7\n\2\2z}\7\26\2\2{|\7\13\2\2|~\7\26\2\2}{\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\7\f\2\2\u0082\u008b\7\25\2\2\u0083\u0084\7\r\2\2\u0084\u0085\7"+
		"\26\2\2\u0085\u0087\7\25\2\2\u0086\u0088\5\f\7\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\21\3\2\2\2\u008d\u008e"+
		"\7\17\2\2\u008e\u008f\7\27\2\2\u008f\u0090\7\f\2\2\u0090\u0091\7\25\2"+
		"\2\u0091\23\3\2\2\2\u0092\u0096\7\20\2\2\u0093\u0094\7\27\2\2\u0094\u0095"+
		"\7\21\2\2\u0095\u0097\7\27\2\2\u0096\u0093\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\7\25\2\2\u009a\25"+
		"\3\2\2\2\u009b\u009c\7\22\2\2\u009c\u009d\7\25\2\2\u009d\27\3\2\2\2\u009e"+
		"\u00a4\7\23\2\2\u009f\u00a5\7\27\2\2\u00a0\u00a5\7\26\2\2\u00a1\u00a2"+
		"\7\27\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a5\7\26\2\2\u00a4\u009f\3\2\2"+
		"\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\7\25\2\2\u00a8\31\3\2\2\2\u00a9"+
		"\u00aa\7\24\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad"+
		"\7\26\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\7\25\2\2\u00af\33\3\2\2\2\25"+
		"!\'\60\66?FLU[_gqsw\177\u0089\u008b\u0096\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}