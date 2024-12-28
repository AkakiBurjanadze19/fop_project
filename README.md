# Token Data Structure

## Description
Token class is used to represent tokens. For example: identifiers and numbers.

## Internals

### constants
```Java
  public static final String IDENTIFIER = "IDENTIFIER";
  public static final String NUMBER = "NUMBER";
  public static final String STRING = "STRING";
  public static final String KEYWORD = "KEYWORD";
  public static final String OPERATOR = "OPERATOR";
  public static final String DELIMITER = "DELIMETER";
  public static final String EOF = "EOF";
```
These are constants representing different token types.

### fields
```Java
  private final String type;
  private final String value;
```
These are the instance variables of the Token class, where type represents the category of the token and value is the actual string content of the token.

### constructor
```Java
  public Token(String type, String value) {
    this.type = type;
    this.value = value;
  }
```
Constructor initializes a Token with a given type and value.

### getter methods
```Java
  public String getType() {
    return this.type;
  }

  public String getValue() {
    return this.value;
  }
```
These getter methods are used to get type/value of the token.

### toString
```Java
  public String toString() {
    return "Token{" + "type='" + type + '\'' + ", value='" + value + '\'' + '}';
  }
```
This `toString` method from `Object` is defined for debugging purposes. specifically to print type and value of the token.

### Examples
We use Token class to represent different types of tokens in our interpreter.  

```Java
  new Token(Token.IDENTIFIER, "x"); // new Token("IDENTIFIER, "x")
  new Token(Token.NUMBER, "12"); // new Token("NUMBER", "12")
  new Token(Token.STRING, "hello"); // new Token("STRING", "hello")
  new Token(Token.KEYWORD, "if"); // new Token("KEYWORD", "if")
  new Token(Token.OPERATOR, "="); // new Token("OPERATOR", "=")
  new Token(Token.DELIMITER, "("); // new Token("DELIMITER", "(")
  new Token(Token.EOF, ""); // new Token("EOF", "")
```

For example if we have ```Ruby name = "john"``` in Ruby:
```Java
  new Token(Token.IDENTIFIER, "name") // new Token("IDENTIFIER, "name")
  new Token(Token.OPERATOR, "=") // new Token("OPERATOR, "=")
  new Token(Token.STRING, "john") // new Token("STRING", "john")
```
We will have three tokens: `name`, `=` and `john`.
