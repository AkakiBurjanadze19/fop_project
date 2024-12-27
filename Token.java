public class Token {
    public static final String IDENTIFIER = "IDENTIFIER"; // for variable names
    public static final String NUMBER = "NUMBER"; // for numeric literals
    public static final String STRING = "STRING"; // for string literals
    public static final String KEYWORD = "KEYWORD"; // for reserved keywords. for example: for, do, e.t.c
    public static final String OPERATOR = "OPERATOR"; // for arithmetic operations:   (+,-,*,/)
    public static final String DELIMITER = "DELIMITER"; // for symbols. for example: ";".
    public static final String EOF = "EOF"; // end of input

    private final String type; // type of the token
    private final String value; // actual value of the token type

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
