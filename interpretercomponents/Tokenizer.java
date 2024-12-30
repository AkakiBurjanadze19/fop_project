package interpretercomponents;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    private final String input; // the input string which will be tokenized
    private int pos; // current position in a string

    // constructor which initializes input and current position in a string by 0 as default
    public Tokenizer(String input) {
        this.input = input;
        this.pos = 0;
    }

    /* returns the list of tokens */
    /* identifies: */
    // operator tokens
    // numeric tokens
    // identifier tokens
    // string tokens
    public List<Token> tokenize() {
        List<Token> tokens = new ArrayList<>(); // this list stores the generated tokens

        // iterate through the whole input string
        while (this.pos < this.input.length()) {
            // grab the current character
            char current = this.input.charAt(this.pos);

            // handle whitespaces
            if (Character.isWhitespace(current)) {
                this.pos++;
                continue;
            }

            // handle newlines
            if (current == '\n') {
                this.pos++;
                continue;
            }

            if (this.pos + 1 < this.input.length()) {
                List<String> multiCharOperators = List.of("!=", "==", "<=", ">=");
                String twoCharOp = this.input.substring(this.pos, this.pos + 2);
                if (multiCharOperators.contains(twoCharOp)) {
                    tokens.add(new Token(Token.OPERATOR, twoCharOp));
                    this.pos += 2;
                    continue;
                }
            }

            if ("{};()".indexOf(current) >= 0) {
                tokens.add(new Token(Token.DELIMITER, String.valueOf(current)));
                this.pos++;
                continue;
            }

            // handle single-character operators
            if ("=+-/*%<>".indexOf(current) >= 0) {
                tokens.add(new Token(Token.OPERATOR, String.valueOf(current)));
                this.pos++;
                continue;
            }

            // collect numeric tokens
            if (Character.isDigit(current)) {
                StringBuilder number = new StringBuilder();
                while (this.pos < this.input.length() && Character.isDigit(this.input.charAt(this.pos))) {
                    number.append(this.input.charAt(this.pos++));
                }
                tokens.add(new Token(Token.NUMBER, number.toString()));
                continue;
            }

            // collect identifier tokens
            if (Character.isLetter(current)) {
                StringBuilder identifier = new StringBuilder();
                while (this.pos < this.input.length() && (Character.isLetterOrDigit(this.input.charAt(pos)) || this.input.charAt(this.pos) == '_')) {
                    identifier.append(this.input.charAt(this.pos++));
                }
                String value = identifier.toString();
                String type = isKeyword(value) ? Token.KEYWORD : Token.IDENTIFIER;
                tokens.add(new Token(type, value));
                continue;
            }

            // collect string tokens
            if (current == '"') {
                this.pos++;
                StringBuilder string = new StringBuilder();
                while (this.pos < this.input.length() && this.input.charAt(this.pos) != '"') {
                    string.append(this.input.charAt(this.pos++));
                }
                if (this.pos >= this.input.length() || this.input.charAt(this.pos) != '"') {
                    throw new IllegalArgumentException("Unterminated string literal");
                }
                this.pos++;
                tokens.add(new Token(Token.STRING, string.toString()));
                continue;
            }

            throw new IllegalArgumentException("No such character: " + current);
        }

        // mark end of the file
        tokens.add(new Token(Token.EOF, ""));
        // return the generated tokens
        return tokens;
    }

    // this boolean method checks if the given value is a keyword
    private boolean isKeyword(String value) {
        return value.equals("if") || value.equals("else") || value.equals("end") || value.equals("while") || value.equals("puts");
    }
}
