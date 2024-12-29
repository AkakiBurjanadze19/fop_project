package interpretercomponents;

public class Token {
    public static final String IDENTIFIER = "IDENTIFIER";
    public static final String NUMBER = "NUMBER";
    public static final String STRING = "STRING";
    public static final String KEYWORD = "KEYWORD";
    public static final String OPERATOR = "OPERATOR";
    public static final String DELIMETER = "DELIMETER";
    public static final String EOF = "EOF";

    private final String type;
    private final String value;

    // constructor which initializes token type and value
    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    // getter method for getting type of the token
    public String getType() {
        return this.type;
    }

    // getter method for getting value of the token type
    public String getValue() {
        return this.value;
    }

    // method for printing the token structure (for debugging purposes)
    public String toString() {
        return "Token{" + "type='" + type + '\'' + ", value='" + value + '\'' + '}';
    }
}
