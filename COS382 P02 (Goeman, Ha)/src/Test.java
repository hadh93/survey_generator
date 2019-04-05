import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        SurveyGeneratorLexer lexer = new SurveyGeneratorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SurveyGeneratorParser parser = new SurveyGeneratorParser(tokens);
        parser.s(); // parse the input stream!
        System.out.println("Parsing complete");
    };
}
