import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream(args[0]);
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        SurveyGeneratorLexer lexer = new SurveyGeneratorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SurveyGeneratorParser parser = new SurveyGeneratorParser(tokens);
        SurveyGeneratorParser.SContext context = parser.s();
        ParseTreeWalker walker = new ParseTreeWalker();
        SurveyTranslator listener = new SurveyTranslator();
        walker.walk(listener, context);
        //parser.s();

        try {
            BufferedWriter writer = null;
			writer = new BufferedWriter(new FileWriter(args[0].substring(0,args[0].length()-3)+"html"));
			writer.write(listener.stringbuilder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Reached the end!");
    }
}
