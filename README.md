# Testing Interpreter Components

## Description
We run simple tests by just printing resulting values of the different components and checking if they work correctly based on the output we get. These are not some complex tests.

## Example
### example using Token class
```Java
  Token identifierToken = new Token(Token.IDENTIFIER, "user");

  System.out.println(identifierToken.getType()); // output: "IDENTIFIER"
  System.out.println(identifierToken.getValue()); // output: "user"
```
