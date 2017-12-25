import Controller.Query;
import Grammar.astgen.ASTGeneration;
import Grammar.astgen.SyntaxStructureGeneration;
import Grammar.parser.nlpLexer;
import Grammar.parser.nlpParser;
import Grammar.utils.S;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

public class Main {
    private static String readInput() {
        String input = null;
        File file = new File("../input/input.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            input = new String(data, "UTF-8");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return input;
    }
    private static void printResult(String input) {
        Query query = new Query();

        ANTLRInputStream antlrInputStream = new ANTLRInputStream(input);
        nlpLexer lexer = new nlpLexer(antlrInputStream);
        CommonTokenStream token = new CommonTokenStream(lexer);
        nlpParser parser = new nlpParser(token);
        nlpParser.SContext sContext = parser.s();

        try {
            SyntaxStructureGeneration syntaxStructureGeneration = new SyntaxStructureGeneration();
            String syntax = (String) syntaxStructureGeneration.visit(sContext);
            ASTGeneration astGeneration = new ASTGeneration();
            S s = (S) astGeneration.visit(sContext);

            PrintWriter outputB = new PrintWriter("output_b.txt", "UTF-8");
            outputB.write(syntax);
            outputB.close();

            PrintWriter outputC = new PrintWriter("output_c.txt", "UTF-8");
            outputC.write(s.toLogicalForm());
            outputC.close();

            PrintWriter outputD = new PrintWriter("output_d.txt", "UTF-8");
            outputD.write(s.toSematic());
            outputD.close();

            PrintWriter outputE = new PrintWriter("output_e.txt", "UTF-8");
            outputE.write(query.printAll(s));
            outputE.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String input = readInput();

        printResult(input);
    }
}
