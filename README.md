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
  private String type;
  private String value;
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
