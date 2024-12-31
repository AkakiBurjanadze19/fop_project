# Tokenizer class

## Description
This Tokenizer class implements `tokenize` method which is kind of a main method responsible for identyfing different types of tokens, collecting and returning them.

## internals
### constructor
`Tokenizer(String input)` - constructor for the tokenizer class 
`input` - input string to be tokenized
#### process
sets the `input` field to the provided string and initializes the `pos` field to 0 marking the beginning of the string to tokenize.

## methods
`public List<Token> tokenize()` - tokenizes the input string into a list of `Token` objects
`isKeyword(String value)` - checks if a given string is a reserved keyword. For example `if`.
