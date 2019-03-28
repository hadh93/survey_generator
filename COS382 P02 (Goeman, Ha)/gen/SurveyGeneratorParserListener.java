// Generated from C:/Users/dongh/Desktop/COS382 P02 (Goeman, Ha)/src\SurveyGeneratorParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SurveyGeneratorParserParser}.
 */
public interface SurveyGeneratorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParserParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SurveyGeneratorParserParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParserParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SurveyGeneratorParserParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParserParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(SurveyGeneratorParserParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParserParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(SurveyGeneratorParserParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParserParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(SurveyGeneratorParserParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParserParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(SurveyGeneratorParserParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParserParser#qtype}.
	 * @param ctx the parse tree
	 */
	void enterQtype(SurveyGeneratorParserParser.QtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParserParser#qtype}.
	 * @param ctx the parse tree
	 */
	void exitQtype(SurveyGeneratorParserParser.QtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParserParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(SurveyGeneratorParserParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParserParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(SurveyGeneratorParserParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SurveyGeneratorParserParser#multi}.
	 * @param ctx the parse tree
	 */
	void enterMulti(SurveyGeneratorParserParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SurveyGeneratorParserParser#multi}.
	 * @param ctx the parse tree
	 */
	void exitMulti(SurveyGeneratorParserParser.MultiContext ctx);
}