package interpretercomponents;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    private String input;
    private int pos;

    public Tokenizer(String input) {
        this.input = input;
        this.pos = 0;
    }

    public List<Token> tokenize() {
        List<Token> tokens = new ArrayList<>();

        while (this.pos < this.input.length()) {
            char current = this.input.charAt(this.pos);

            // handle whitespaces
            if (Character.isWhitespace(current)) {
                this.pos++;
                continue;
            }

            if (current == '\n') {
                this.pos++;
                continue;
            }

            // handle multi-character operators
            if (this.pos + 1 < this.input.length()) {
                String twoCharOp = this.input.substring(this.pos, this.pos + 2);
                if ("!= == <= >=".contains(twoCharOp)) {
                    tokens.add(new Token(Token.OPERATOR, twoCharOp));
                    this.pos += 2;
                    continue;
                }
            }

            // handle single-character operators
            if ("+-/*%{};()<>".indexOf(current) >= 0) {
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
                while (this.pos < this.input.length() && Character.isLetterOrDigit(this.input.charAt(pos)) || this.input.charAt(this.pos) == '_') {
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
                this.pos++;
                tokens.add(new Token(Token.STRING, string.toString()));
                continue;
            }

            throw new IllegalArgumentException("No such character: " + current);
        }

        tokens.add(new Token(Token.EOF, ""));
        return tokens;
    }

    public boolean isKeyword(String value) {
        return value.equals("if") || value.equals("else") || value.equals("end") || value.equals("while") || value.equals("puts");
    }
}
