// Generated from C:/Users/dongh/Desktop/Spring 2019/LS Proj/COS382 P02 (Goeman, Ha)/src\SurveyGenerator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SurveyGeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SurveyGeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SurveyGeneratorParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(SurveyGeneratorParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(SurveyGeneratorParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#pagetitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPagetitle(SurveyGeneratorParser.PagetitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#qtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtype(SurveyGeneratorParser.QtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(SurveyGeneratorParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#questiontitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestiontitle(SurveyGeneratorParser.QuestiontitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#subquestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquestion(SurveyGeneratorParser.SubquestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti(SurveyGeneratorParser.MultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#multiplechoiceoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplechoiceoption(SurveyGeneratorParser.MultiplechoiceoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(SurveyGeneratorParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#singlechoiceoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglechoiceoption(SurveyGeneratorParser.SinglechoiceoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#textentry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextentry(SurveyGeneratorParser.TextentryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#maxlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxlength(SurveyGeneratorParser.MaxlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SurveyGeneratorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#minimum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimum(SurveyGeneratorParser.MinimumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#maximum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximum(SurveyGeneratorParser.MaximumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(SurveyGeneratorParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#upload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpload(SurveyGeneratorParser.UploadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(SurveyGeneratorParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#minlabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinlabel(SurveyGeneratorParser.MinlabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParser#maxlabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxlabel(SurveyGeneratorParser.MaxlabelContext ctx);
}