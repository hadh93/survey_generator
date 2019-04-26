// Generated from C:/Users/dongh/Desktop/Spring 2019/LS Proj/COS382 P02 (Goeman, Ha)/src\SurveyGenerator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SurveyGeneratorParser}.
 */
public interface SurveyGeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SurveyGeneratorParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SurveyGeneratorParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(SurveyGeneratorParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(SurveyGeneratorParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(SurveyGeneratorParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(SurveyGeneratorParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#pagetitle}.
	 * @param ctx the parse tree
	 */
	void enterPagetitle(SurveyGeneratorParser.PagetitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#pagetitle}.
	 * @param ctx the parse tree
	 */
	void exitPagetitle(SurveyGeneratorParser.PagetitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#qtype}.
	 * @param ctx the parse tree
	 */
	void enterQtype(SurveyGeneratorParser.QtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#qtype}.
	 * @param ctx the parse tree
	 */
	void exitQtype(SurveyGeneratorParser.QtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(SurveyGeneratorParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(SurveyGeneratorParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#questiontitle}.
	 * @param ctx the parse tree
	 */
	void enterQuestiontitle(SurveyGeneratorParser.QuestiontitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#questiontitle}.
	 * @param ctx the parse tree
	 */
	void exitQuestiontitle(SurveyGeneratorParser.QuestiontitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#subquestion}.
	 * @param ctx the parse tree
	 */
	void enterSubquestion(SurveyGeneratorParser.SubquestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#subquestion}.
	 * @param ctx the parse tree
	 */
	void exitSubquestion(SurveyGeneratorParser.SubquestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#multi}.
	 * @param ctx the parse tree
	 */
	void enterMulti(SurveyGeneratorParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#multi}.
	 * @param ctx the parse tree
	 */
	void exitMulti(SurveyGeneratorParser.MultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#multiplechoiceoption}.
	 * @param ctx the parse tree
	 */
	void enterMultiplechoiceoption(SurveyGeneratorParser.MultiplechoiceoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#multiplechoiceoption}.
	 * @param ctx the parse tree
	 */
	void exitMultiplechoiceoption(SurveyGeneratorParser.MultiplechoiceoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#nestedchoice}.
	 * @param ctx the parse tree
	 */
	void enterNestedchoice(SurveyGeneratorParser.NestedchoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#nestedchoice}.
	 * @param ctx the parse tree
	 */
	void exitNestedchoice(SurveyGeneratorParser.NestedchoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(SurveyGeneratorParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(SurveyGeneratorParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#randomizer}.
	 * @param ctx the parse tree
	 */
	void enterRandomizer(SurveyGeneratorParser.RandomizerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#randomizer}.
	 * @param ctx the parse tree
	 */
	void exitRandomizer(SurveyGeneratorParser.RandomizerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#singlechoiceoption}.
	 * @param ctx the parse tree
	 */
	void enterSinglechoiceoption(SurveyGeneratorParser.SinglechoiceoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#singlechoiceoption}.
	 * @param ctx the parse tree
	 */
	void exitSinglechoiceoption(SurveyGeneratorParser.SinglechoiceoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#nestedchoice2}.
	 * @param ctx the parse tree
	 */
	void enterNestedchoice2(SurveyGeneratorParser.Nestedchoice2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#nestedchoice2}.
	 * @param ctx the parse tree
	 */
	void exitNestedchoice2(SurveyGeneratorParser.Nestedchoice2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#textentry}.
	 * @param ctx the parse tree
	 */
	void enterTextentry(SurveyGeneratorParser.TextentryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#textentry}.
	 * @param ctx the parse tree
	 */
	void exitTextentry(SurveyGeneratorParser.TextentryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#maxlength}.
	 * @param ctx the parse tree
	 */
	void enterMaxlength(SurveyGeneratorParser.MaxlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#maxlength}.
	 * @param ctx the parse tree
	 */
	void exitMaxlength(SurveyGeneratorParser.MaxlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SurveyGeneratorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SurveyGeneratorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#minimum}.
	 * @param ctx the parse tree
	 */
	void enterMinimum(SurveyGeneratorParser.MinimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#minimum}.
	 * @param ctx the parse tree
	 */
	void exitMinimum(SurveyGeneratorParser.MinimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#maximum}.
	 * @param ctx the parse tree
	 */
	void enterMaximum(SurveyGeneratorParser.MaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#maximum}.
	 * @param ctx the parse tree
	 */
	void exitMaximum(SurveyGeneratorParser.MaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(SurveyGeneratorParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(SurveyGeneratorParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#upload}.
	 * @param ctx the parse tree
	 */
	void enterUpload(SurveyGeneratorParser.UploadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#upload}.
	 * @param ctx the parse tree
	 */
	void exitUpload(SurveyGeneratorParser.UploadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(SurveyGeneratorParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(SurveyGeneratorParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#minlabel}.
	 * @param ctx the parse tree
	 */
	void enterMinlabel(SurveyGeneratorParser.MinlabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#minlabel}.
	 * @param ctx the parse tree
	 */
	void exitMinlabel(SurveyGeneratorParser.MinlabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParser#maxlabel}.
	 * @param ctx the parse tree
	 */
	void enterMaxlabel(SurveyGeneratorParser.MaxlabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParser#maxlabel}.
	 * @param ctx the parse tree
	 */
	void exitMaxlabel(SurveyGeneratorParser.MaxlabelContext ctx);
}