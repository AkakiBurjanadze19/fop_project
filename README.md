# Interpreter Fix

## Description
I fixed some operations of the interpeter itself and for the tokenizer as well. Mainly i added support for the `break` statement in while loops and modified collecting token behavior in the tokenizer so that it now identifies break statements and collects them into a tokens list as well.

### simple code example
break statement which breaks out of the while loop (basically terminates the loop execution)
```Java
 String string = new StringBuilder();
 string.append("x = 0\n");
 string.append("while x < 5 {\n");
 string.append(" puts x\n");
 string.append(" x = x + 1\n");
 string.append("if x > 3 {\n");
 string.append(" break\n");
 string.append(" }");
 string.append("}");
```
