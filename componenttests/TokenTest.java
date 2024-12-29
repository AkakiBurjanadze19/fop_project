package componenttests;

import interpretercomponents.Token;

public class TokenTest {
    public static void main (String[] args){
        System.out.println("Token structures: ");
        System.out.println(new Token(Token.IDENTIFIER, "x"));
        System.out.println(new Token(Token.NUMBER, "8"));
        System.out.println(new Token(Token.STRING, "nigger"));
        System.out.println(new Token(Token.KEYWORD, "if"));
        System.out.println(new Token(Token.OPERATOR, "-"));
        System.out.println(new Token(Token.DELIMITER, ")"));
        System.out.println(new Token(Token.EOF, ""));

        System.out.println();

        System.out.println("Token types: ");
        System.out.println(new Token(Token.IDENTIFIER, "x").getType());
        System.out.println(new Token(Token.NUMBER, "8").getType());
        System.out.println(new Token(Token.STRING, "nigger").getType());
        System.out.println(new Token(Token.KEYWORD, "if").getType());
        System.out.println(new Token(Token.OPERATOR, "-").getType());
        System.out.println(new Token(Token.DELIMITER, ")").getType());
        System.out.println(new Token(Token.EOF, "").getType());

        System.out.println();

        System.out.println("Token values: ");
        System.out.println(new Token(Token.IDENTIFIER, "x").getValue());
        System.out.println(new Token(Token.NUMBER, "8").getValue());
        System.out.println(new Token(Token.STRING, "nigger").getValue());
        System.out.println(new Token(Token.KEYWORD, "if").getValue());
        System.out.println(new Token(Token.OPERATOR, "-").getValue());
        System.out.println(new Token(Token.DELIMITER, ")").getValue());
        System.out.println(new Token(Token.EOF, "").getValue());

        System.out.println();

        System.out.println("Token types and values: ");

        Token identifierToken = new Token(Token.IDENTIFIER, "x");
        Token numberToken = new Token(Token.NUMBER, "8");
        Token stringToken = new Token(Token.STRING, "nigger");
        Token keywordToken = new Token(Token.KEYWORD, "if");
        Token operatorToken = new Token(Token.OPERATOR, "-");
        Token delimiterToken = new Token(Token.DELIMITER, ")");
        Token eofToken = new Token(Token.EOF, "");

        System.out.println(identifierToken.getType() + " : " + identifierToken.getValue());
        System.out.println(numberToken.getType() + " : " + numberToken.getValue());
        System.out.println(stringToken.getType() + " : " + stringToken.getValue());
        System.out.println(keywordToken.getType() + " : " + keywordToken.getValue());
        System.out.println(operatorToken.getType() + " : " + operatorToken.getValue());
        System.out.println(delimiterToken.getType() + " : " + delimiterToken.getValue());
        System.out.println(eofToken.getType() + " : " + eofToken.getValue());

    }
}
