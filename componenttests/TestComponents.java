package componenttests;
import interpretercomponents.Token;
public class TestComponents {
    public static void main(String[] args){
        System.out.println(new Token(Token.IDENTIFIER,"x"));
        System.out.println(new Token(Token.NUMBER,"8"));
        System.out.println(new Token(Token.STRING,"nigger"));
        System.out.println(new Token(Token.KEYWORD,"if"));
        System.out.println(new Token(Token.OPERATOR,"-"));
        System.out.println(new Token(Token.DELIMETER,")"));
        System.out.println(new Token(Token.EOF,""));

    }


}


