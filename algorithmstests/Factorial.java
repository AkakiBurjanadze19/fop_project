package algorithmstests;

import interpretercomponents.Interpreter;

public class Factorial {
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder();

        code.append("n = 5\n");
        code.append("factorial = 1\n");
        code.append("x = 1\n");
        code.append("while x <= n {\n");
        code.append(" factorial = factorial * x\n");
        code.append(" x = x + 1\n");
        code.append("}\n");
        code.append("puts factorial\n");

        String input = code.toString();

        Interpreter interpreter = new Interpreter(input);
        interpreter.execute();
    }
}
