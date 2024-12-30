# Testing Interpreter

## Description
Different code snippets which use different language constructs are used to test the interpreter to ensure that it correctly translates and executes code which is feeded inside it.

## language constructs used in tests
Following language constructs were used for testing the interpreter.
* variable assignment
* arithmetic operations
* if-else conditionals
* iterative control flow
* printing statement

### simple example
```Java
 StringBuilder string = new StringBuilder();
 string.append("puts 2 + 3\n");
 string.append("puts 100 / 20");

 String code = string.toString();

 Interpreter interpreter = new Interpreter(code);
 interpreter.execute();
```
