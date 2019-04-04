// Generated from C:/Users/dongh/Desktop/LS Proj/COS382 P02 (Goeman, Ha)/src\SurveyGeneratorParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SurveyGeneratorParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TEXT=19, INTEGER=20, NUMBER=21, WS=22;
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
			null, "'!'", "'\n'", "'~'", "'?'", "'\t?'", "'\n\t'", "'multi'", "'%'", 
			"'['", "']\n'", "'>'", "'single'", "'textentry['", "'number['", "'|'", 
			"'date[]\n'", "'upload['", "'scale['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXT", "INTEGER", "NUMBER", 
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
	public String getGrammarFileName() { return "SurveyGeneratorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SurveyGeneratorParserParser(TokenStream input) {
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
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitS(this);
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
			setState(28);
			match(T__1);
			}
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				page();
				}
				}
				setState(33); 
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParserParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParserParser.TEXT, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitPage(this);
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
			setState(37);
			match(T__2);
			setState(38);
			match(TEXT);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(39);
				match(T__1);
				}
			}

			}
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				question();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterQtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitQtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitQtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtypeContext qtype() throws RecognitionException {
		QtypeContext _localctx = new QtypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qtype);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				multi();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				single();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				textentry();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				number();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				date();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				upload();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
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
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParserParser.TEXT, 0); }
		public QtypeContext qtype() {
			return getRuleContext(QtypeContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitQuestion(this);
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
			setState(56);
			match(T__3);
			setState(57);
			match(TEXT);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(T__1);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(63);
			qtype();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(64);
				match(T__1);
				}
				}
				setState(69);
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
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParserParser.TEXT, 0); }
		public QtypeContext qtype() {
			return getRuleContext(QtypeContext.class,0);
		}
		public SubquestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterSubquestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitSubquestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitSubquestion(this);
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
			setState(70);
			match(T__4);
			setState(71);
			match(TEXT);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(T__5);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(77);
			qtype();
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public List<TerminalNode> TEXT() { return getTokens(SurveyGeneratorParserParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SurveyGeneratorParserParser.TEXT, i);
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
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitMulti(this);
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
			setState(83);
			match(T__6);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(84);
				match(T__7);
				}
			}

			setState(87);
			match(T__8);
			setState(88);
			match(TEXT);
			setState(89);
			match(T__9);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(90);
				match(T__10);
				setState(91);
				match(TEXT);
				setState(92);
				match(T__1);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					subquestion();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
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
		public List<TerminalNode> TEXT() { return getTokens(SurveyGeneratorParserParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SurveyGeneratorParserParser.TEXT, i);
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
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitSingle(this);
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
			setState(100);
			match(T__11);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(101);
				match(T__7);
				}
			}

			setState(104);
			match(T__8);
			setState(105);
			match(TEXT);
			setState(106);
			match(T__9);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(107);
				match(T__10);
				setState(108);
				match(TEXT);
				setState(109);
				match(T__1);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					subquestion();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
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
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParserParser.INTEGER, 0); }
		public TextentryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textentry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterTextentry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitTextentry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitTextentry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextentryContext textentry() throws RecognitionException {
		TextentryContext _localctx = new TextentryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textentry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__12);
			setState(118);
			match(INTEGER);
			setState(119);
			match(T__9);
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
		public List<TerminalNode> INTEGER() { return getTokens(SurveyGeneratorParserParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SurveyGeneratorParserParser.INTEGER, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitNumber(this);
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
			setState(121);
			match(T__13);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(122);
				match(INTEGER);
				setState(123);
				match(T__14);
				setState(124);
				match(INTEGER);
				}
			}

			setState(127);
			match(T__9);
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
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__15);
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
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParserParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParserParser.TEXT, 0); }
		public UploadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterUpload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitUpload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitUpload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UploadContext upload() throws RecognitionException {
		UploadContext _localctx = new UploadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_upload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__16);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(132);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(133);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(134);
				match(INTEGER);
				setState(135);
				match(T__14);
				setState(136);
				match(TEXT);
				}
				break;
			}
			setState(139);
			match(T__9);
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
		public List<TerminalNode> TEXT() { return getTokens(SurveyGeneratorParserParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SurveyGeneratorParserParser.TEXT, i);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorParserListener ) ((SurveyGeneratorParserListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorParserVisitor ) return ((SurveyGeneratorParserVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__17);
			setState(142);
			match(TEXT);
			setState(143);
			match(T__14);
			setState(144);
			match(TEXT);
			setState(145);
			match(T__9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\6\2\"\n\2\r\2\16\2"+
		"#\3\3\3\3\3\4\3\4\3\4\5\4+\n\4\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\6\3\6\7\6D\n\6"+
		"\f\6\16\6G\13\6\3\7\3\7\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\6\7R\n\7\r\7\16"+
		"\7S\3\b\3\b\5\bX\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\ba\n\b\r\b\16\bb\5"+
		"\be\n\b\3\t\3\t\5\ti\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\tr\n\t\r\t\16\t"+
		"s\5\tv\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2"+
		"\u009f\2\34\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fH\3"+
		"\2\2\2\16U\3\2\2\2\20f\3\2\2\2\22w\3\2\2\2\24{\3\2\2\2\26\u0083\3\2\2"+
		"\2\30\u0085\3\2\2\2\32\u008f\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2\36\37"+
		"\7\4\2\2\37!\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$\3\3\2\2\2%&\7\25\2\2&\5\3\2\2\2\'(\7\5\2\2(*\7\25\2\2)+\7\4\2\2*)"+
		"\3\2\2\2*+\3\2\2\2+-\3\2\2\2,.\5\n\6\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/"+
		"\60\3\2\2\2\60\7\3\2\2\2\619\5\16\b\2\629\5\20\t\2\639\5\22\n\2\649\5"+
		"\24\13\2\659\5\26\f\2\669\5\30\r\2\679\5\32\16\28\61\3\2\2\28\62\3\2\2"+
		"\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\t\3\2"+
		"\2\2:;\7\6\2\2;=\7\25\2\2<>\7\4\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3"+
		"\2\2\2@A\3\2\2\2AE\5\b\5\2BD\7\4\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2F\13\3\2\2\2GE\3\2\2\2HI\7\7\2\2IK\7\25\2\2JL\7\b\2\2KJ\3\2\2\2"+
		"LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\5\b\5\2PR\7\4\2\2QP\3\2\2\2"+
		"RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2UW\7\t\2\2VX\7\n\2\2WV\3\2\2"+
		"\2WX\3\2\2\2XY\3\2\2\2YZ\7\13\2\2Z[\7\25\2\2[d\7\f\2\2\\]\7\r\2\2]^\7"+
		"\25\2\2^`\7\4\2\2_a\5\f\7\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce"+
		"\3\2\2\2d\\\3\2\2\2de\3\2\2\2e\17\3\2\2\2fh\7\16\2\2gi\7\n\2\2hg\3\2\2"+
		"\2hi\3\2\2\2ij\3\2\2\2jk\7\13\2\2kl\7\25\2\2lu\7\f\2\2mn\7\r\2\2no\7\25"+
		"\2\2oq\7\4\2\2pr\5\f\7\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2"+
		"\2\2um\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wx\7\17\2\2xy\7\26\2\2yz\7\f\2\2z"+
		"\23\3\2\2\2{\177\7\20\2\2|}\7\26\2\2}~\7\21\2\2~\u0080\7\26\2\2\177|\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\f\2\2\u0082"+
		"\25\3\2\2\2\u0083\u0084\7\22\2\2\u0084\27\3\2\2\2\u0085\u008b\7\23\2\2"+
		"\u0086\u008c\7\26\2\2\u0087\u008c\7\25\2\2\u0088\u0089\7\26\2\2\u0089"+
		"\u008a\7\21\2\2\u008a\u008c\7\25\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3"+
		"\2\2\2\u008b\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\f\2\2\u008e\31\3\2\2\2\u008f\u0090\7\24\2\2\u0090\u0091\7\25"+
		"\2\2\u0091\u0092\7\21\2\2\u0092\u0093\7\25\2\2\u0093\u0094\7\f\2\2\u0094"+
		"\33\3\2\2\2\22#*/8?EMSWbdhsu\177\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}