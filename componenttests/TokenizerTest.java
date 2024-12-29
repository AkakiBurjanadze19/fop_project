package componenttests;
import interpretercomponents.Tokenizer;
import java.util.List;
import interpretercomponents.Token;
public class TokenizerTest {
    public static void main (String[] args){

        String input = "puts 10 + 20";
        Tokenizer tokenizer = new Tokenizer(input);
        List <Token> tokens = tokenizer.tokenize();
        for (Token token : tokens){
            System.out.println(token);
        }

    }
}
