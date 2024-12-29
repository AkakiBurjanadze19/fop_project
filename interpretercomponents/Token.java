package interpretercomponents;

public class Token {
    public static final String IDENTIFIER = "IDENTIFIER"; // for variable names
    public static final String NUMBER = "NUMBER"; // for numbers like "12"
    public static final String STRING = "STRING"; // for strings like "hello"
    public static final String KEYWORD = "KEYWORD"; // for reserved keywords like if
    public static final String OPERATOR = "OPERATOR"; // for operators like =
    public static final String DELIMITER = "DELIMITER"; // for delimiters like '('
    public static final String EOF = "EOF"; // end of the file

    private final String type; // for token type
    private final String value; // for token value

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
