// Generated from C:/Users/dongh/Desktop/Spring 2019/LS Proj/COS382 P02 (Goeman, Ha)/src\SurveyGenerator.g4 by ANTLR 4.7.2
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
		RULE_s = 0, RULE_title = 1, RULE_page = 2, RULE_pagetitle = 3, RULE_qtype = 4, 
		RULE_question = 5, RULE_questiontitle = 6, RULE_subquestion = 7, RULE_multi = 8, 
		RULE_multiplechoiceoption = 9, RULE_single = 10, RULE_singlechoiceoption = 11, 
		RULE_textentry = 12, RULE_number = 13, RULE_date = 14, RULE_upload = 15, 
		RULE_scale = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "title", "page", "pagetitle", "qtype", "question", "questiontitle", 
			"subquestion", "multi", "multiplechoiceoption", "single", "singlechoiceoption", 
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
			setState(34);
			match(T__0);
			setState(35);
			title();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(36);
				match(NL);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				page();
				}
				}
				setState(45); 
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
			setState(47);
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
		public PagetitleContext pagetitle() {
			return getRuleContext(PagetitleContext.class,0);
		}
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
			setState(49);
			match(T__1);
			setState(50);
			pagetitle();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(51);
				match(NL);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				question();
				}
				}
				setState(60); 
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

	public static class PagetitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public PagetitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pagetitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterPagetitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitPagetitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitPagetitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PagetitleContext pagetitle() throws RecognitionException {
		PagetitleContext _localctx = new PagetitleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pagetitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 8, RULE_qtype);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				multi();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				single();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				textentry();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				number();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				date();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				upload();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
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
		public QuestiontitleContext questiontitle() {
			return getRuleContext(QuestiontitleContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			questiontitle();
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				match(NL);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(80);
			qtype();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(81);
				match(NL);
				}
				}
				setState(86);
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

	public static class QuestiontitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public QuestiontitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questiontitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterQuestiontitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitQuestiontitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitQuestiontitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestiontitleContext questiontitle() throws RecognitionException {
		QuestiontitleContext _localctx = new QuestiontitleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questiontitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		enterRule(_localctx, 14, RULE_subquestion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__3);
			setState(90);
			match(TEXT);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(NL);
				setState(92);
				match(T__4);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(97);
			qtype();
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(98);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
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
		public List<MultiplechoiceoptionContext> multiplechoiceoption() {
			return getRuleContexts(MultiplechoiceoptionContext.class);
		}
		public MultiplechoiceoptionContext multiplechoiceoption(int i) {
			return getRuleContext(MultiplechoiceoptionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
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
		enterRule(_localctx, 16, RULE_multi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__5);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(104);
				match(T__6);
				}
			}

			setState(107);
			match(T__7);
			setState(108);
			multiplechoiceoption();
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(T__8);
				setState(110);
				multiplechoiceoption();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(115);
			match(T__9);
			setState(116);
			match(NL);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(117);
				match(T__10);
				setState(118);
				match(TEXT);
				setState(119);
				match(NL);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					subquestion();
					}
					}
					setState(123); 
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

	public static class MultiplechoiceoptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public MultiplechoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplechoiceoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMultiplechoiceoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMultiplechoiceoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMultiplechoiceoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplechoiceoptionContext multiplechoiceoption() throws RecognitionException {
		MultiplechoiceoptionContext _localctx = new MultiplechoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplechoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	public static class SingleContext extends ParserRuleContext {
		public List<SinglechoiceoptionContext> singlechoiceoption() {
			return getRuleContexts(SinglechoiceoptionContext.class);
		}
		public SinglechoiceoptionContext singlechoiceoption(int i) {
			return getRuleContext(SinglechoiceoptionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
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
		enterRule(_localctx, 20, RULE_single);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__11);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(130);
				match(T__6);
				}
			}

			setState(133);
			match(T__7);
			setState(134);
			singlechoiceoption();
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				match(T__8);
				setState(136);
				singlechoiceoption();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(141);
			match(T__9);
			setState(142);
			match(NL);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(143);
				match(T__10);
				setState(144);
				match(TEXT);
				setState(145);
				match(NL);
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					subquestion();
					}
					}
					setState(149); 
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

	public static class SinglechoiceoptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public SinglechoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlechoiceoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterSinglechoiceoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitSinglechoiceoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitSinglechoiceoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglechoiceoptionContext singlechoiceoption() throws RecognitionException {
		SinglechoiceoptionContext _localctx = new SinglechoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singlechoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 24, RULE_textentry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__12);
			setState(156);
			match(INTEGER);
			setState(157);
			match(T__9);
			setState(158);
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
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__13);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(161);
				match(INTEGER);
				setState(162);
				match(T__14);
				setState(163);
				match(INTEGER);
				}
			}

			setState(166);
			match(T__9);
			setState(167);
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
		enterRule(_localctx, 28, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__15);
			setState(170);
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
		enterRule(_localctx, 30, RULE_upload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__16);
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(173);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(174);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(175);
				match(INTEGER);
				setState(176);
				match(T__14);
				setState(177);
				match(TEXT);
				}
				break;
			}
			setState(180);
			match(T__9);
			setState(181);
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
		enterRule(_localctx, 32, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__17);
			setState(184);
			match(TEXT);
			setState(185);
			match(T__14);
			setState(186);
			match(TEXT);
			setState(187);
			match(T__9);
			setState(188);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\6\2.\n\2\r\2\16\2/\3\3\3\3\3"+
		"\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\6\4=\n\4\r\4\16\4>\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\6\7O\n\7\r\7\16\7P\3\7"+
		"\3\7\7\7U\n\7\f\7\16\7X\13\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t`\n\t\r\t\16\t"+
		"a\3\t\3\t\6\tf\n\t\r\t\16\tg\3\n\3\n\5\nl\n\n\3\n\3\n\3\n\3\n\6\nr\n\n"+
		"\r\n\16\ns\3\n\3\n\3\n\3\n\3\n\3\n\6\n|\n\n\r\n\16\n}\5\n\u0080\n\n\3"+
		"\13\3\13\3\f\3\f\5\f\u0086\n\f\3\f\3\f\3\f\3\f\6\f\u008c\n\f\r\f\16\f"+
		"\u008d\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0096\n\f\r\f\16\f\u0097\5\f\u009a"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00a7\n"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b5"+
		"\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\2\2\23\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00c9\2$\3\2\2\2\4\61\3"+
		"\2\2\2\6\63\3\2\2\2\b@\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16Y\3\2\2\2\20[\3"+
		"\2\2\2\22i\3\2\2\2\24\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u009b\3\2\2\2"+
		"\32\u009d\3\2\2\2\34\u00a2\3\2\2\2\36\u00ab\3\2\2\2 \u00ae\3\2\2\2\"\u00b9"+
		"\3\2\2\2$%\7\3\2\2%)\5\4\3\2&(\7\25\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\7\26\2\2\62\5\3\2\2\2\63\64\7\4\2\2"+
		"\648\5\b\5\2\65\67\7\25\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3"+
		"\2\2\29<\3\2\2\2:8\3\2\2\2;=\5\f\7\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?\7\3\2\2\2@A\7\26\2\2A\t\3\2\2\2BJ\5\22\n\2CJ\5\26\f\2DJ\5\32\16"+
		"\2EJ\5\34\17\2FJ\5\36\20\2GJ\5 \21\2HJ\5\"\22\2IB\3\2\2\2IC\3\2\2\2ID"+
		"\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KL\7\5\2\2"+
		"LN\5\16\b\2MO\7\25\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2"+
		"\2RV\5\n\6\2SU\7\25\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\r\3\2"+
		"\2\2XV\3\2\2\2YZ\7\26\2\2Z\17\3\2\2\2[\\\7\6\2\2\\_\7\26\2\2]^\7\25\2"+
		"\2^`\7\7\2\2_]\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\5\n\6"+
		"\2df\7\25\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\21\3\2\2\2ik\7"+
		"\b\2\2jl\7\t\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\n\2\2nq\5\24\13\2o"+
		"p\7\13\2\2pr\5\24\13\2qo\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uv\7\f\2\2v\177\7\25\2\2wx\7\r\2\2xy\7\26\2\2y{\7\25\2\2z|\5\20\t\2"+
		"{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177w\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\23\3\2\2\2\u0081\u0082\7\26\2\2\u0082\25\3\2\2\2"+
		"\u0083\u0085\7\16\2\2\u0084\u0086\7\t\2\2\u0085\u0084\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u008b\5\30\r\2"+
		"\u0089\u008a\7\13\2\2\u008a\u008c\5\30\r\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0099\7\25\2\2\u0091\u0092\7\r\2\2\u0092\u0093\7"+
		"\26\2\2\u0093\u0095\7\25\2\2\u0094\u0096\5\20\t\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u009a\3\2\2\2\u009a\27\3\2\2\2\u009b"+
		"\u009c\7\26\2\2\u009c\31\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\7\27"+
		"\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\7\25\2\2\u00a1\33\3\2\2\2\u00a2\u00a6"+
		"\7\20\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a7\7\27\2"+
		"\2\u00a6\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\7\f\2\2\u00a9\u00aa\7\25\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac"+
		"\u00ad\7\25\2\2\u00ad\37\3\2\2\2\u00ae\u00b4\7\23\2\2\u00af\u00b5\7\27"+
		"\2\2\u00b0\u00b5\7\26\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\7\21\2\2\u00b3"+
		"\u00b5\7\26\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7"+
		"\u00b8\7\25\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\7\26\2"+
		"\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00be\7\f\2\2\u00be"+
		"\u00bf\7\25\2\2\u00bf#\3\2\2\2\25)/8>IPVagks}\177\u0085\u008d\u0097\u0099"+
		"\u00a6\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}