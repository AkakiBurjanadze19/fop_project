package componenttests;

import interpretercomponents.Token;
import interpretercomponents.Tokenizer;

import java.util.List;
public class TokenizerTest {
    public static void main (String[] args){

        System.out.println("puts 10 + 20");
        String input1 = "puts 10 + 20";
        Tokenizer tokenizer1 = new Tokenizer(input1);
        List <Token> tokens1 = tokenizer1.tokenize();
        for (Token token : tokens1){
            System.out.println(token);
        }

        System.out.println();

        System.out.println("puts 10 - 5");
        String input2 = "puts 10 - 5";
        Tokenizer tokenizer2 = new Tokenizer(input2);
        List<Token> tokens2 = tokenizer2.tokenize();
        for (Token token : tokens2) {
            System.out.println(token);
        }

        System.out.println();

        System.out.println("puts 20 * 3");
        String input3 = "puts 20 * 3";
        Tokenizer tokenizer3 = new Tokenizer(input3);
        List<Token> tokens3 = tokenizer3.tokenize();
        for (Token token : tokens3) {
            System.out.println(token);
        }

        System.out.println();

        System.out.println("puts 20 / 3");
        String input4 = "puts 20 / 3";
        Tokenizer tokenizer4 = new Tokenizer(input4);
        List<Token> tokens4 = tokenizer4.tokenize();
        for (Token token : tokens4) {
            System.out.println(token);
        }

        System.out.println();

        System.out.println("puts 100 % 20");
        String input5 = "puts 100 % 20";
        Tokenizer tokenizer5 = new Tokenizer(input5);
        List<Token> tokens5 = tokenizer5.tokenize();
        for (Token token : tokens5) {
            System.out.println(token);
        }
    }
}
