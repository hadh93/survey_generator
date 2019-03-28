// Generated from C:/Users/dongh/Desktop/COS382 P02 (Goeman, Ha)/src\SurveyGeneratorParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SurveyGeneratorParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SurveyGeneratorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParserParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SurveyGeneratorParserParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParserParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(SurveyGeneratorParserParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParserParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(SurveyGeneratorParserParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParserParser#qtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtype(SurveyGeneratorParserParser.QtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParserParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(SurveyGeneratorParserParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SurveyGeneratorParserParser#multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti(SurveyGeneratorParserParser.MultiContext ctx);
}