# Tokenizer class

## Description
This Tokenizer class implements `tokenize` method which is kind of a main method responsible for identyfing different types of tokens, collecting and returning them.

## internals
### `tokenize` method
```Java
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

        // mark end of the file
        tokens.add(new Token(Token.EOF, ""));
        // return the generated tokens
        return tokens;
    }
```
### components of the Tokenizer class
```Java
  private String input;
  private int pos;
```
input instance variable is used to hold the string which will be tokenized
pos instance variable denotes the current position in the string

```Java
public Tokenizer(String input) {
        this.input = input;
        this.pos = 0;
    }
```
constructor method which initializes input and pos instance variables

### sub components of `tokenize` method
```Java
  List<Token> tokens = new ArrayList<>(); // this list stores the generated tokens
```
tokens list which is used to store different types of tokens

```Java
  while (this.pos < this.input.length()) {
   // grab the current character
   char current = this.input.charAt(this.pos);
  }
```
iterates through the whole string and at each iteration grabs the current character

```Java
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
```
first if statement is used to check for whitespaces and ignore them, basically skip them by moving to the next character and the second if statement is used to check for newlines and skip them as well by moving to the next character.

```Java
  // handle multi-character operators
            if (this.pos + 1 < this.input.length()) {
                String twoCharOp = this.input.substring(this.pos, this.pos + 2);
                if ("!= == <= >=".contains(twoCharOp)) {
                    tokens.add(new Token(Token.OPERATOR, twoCharOp));
                    this.pos += 2;
                    continue;
                }
            }
```
This chunk of code identifies two character operations and collects them into a tokens list

```Java
// handle single-character operators
            if ("+-/*%{};()<>".indexOf(current) >= 0) {
                tokens.add(new Token(Token.OPERATOR, String.valueOf(current)));
                this.pos++;
                continue;
            }
```
This chunk of code identifies single character operators and collects them into a tokens list

```Java
  if (Character.isDigit(current)) {
                StringBuilder number = new StringBuilder();
                while (this.pos < this.input.length() && Character.isDigit(this.input.charAt(this.pos))) {
                    number.append(this.input.charAt(this.pos++));
                }
                tokens.add(new Token(Token.NUMBER, number.toString()));
                continue;
            }
```
This chunk of code identifies numeric tokens and collects them into a tokens list

```Java
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
```
This chunk of code identifies identifiers and keywords and collects them into a tokens list

```Java
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
```
This chunk of code identifies string tokens and collects them into a tokens list

```Java
  throw new IllegalArgumentException("No such character: " + current);
```
This code throws an exception if it cannot identify the current character like what type of token it is

```Java
 tokens.add(new Token(Token.EOF, ""));
```
This code marks end of the file by adding an EOF token to the tokens list

```Java
  return tokens
```
returns the list of tokens

## boolean method for checking keywords
```Java
// this boolean method checks if the given value is a keyword
    public boolean isKeyword(String value) {
        return value.equals("if") || value.equals("else") || value.equals("end") || value.equals("while") || value.equals("puts");
    }
```
This chunk of code identifies if the given value is a keyword by checking if it's a reserved keyword used in a Ruby programming language

## Example
```Java
        System.out.println("puts 10 + 20");
        String input1 = "puts 10 + 20";
        Tokenizer tokenizer1 = new Tokenizer(input1);
        List <Token> tokens1 = tokenizer1.tokenize();
        for (Token token : tokens1){
            System.out.println(token);
        }
```
