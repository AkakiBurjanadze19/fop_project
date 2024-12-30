package algorithmstests;

import interpretercomponents.Interpreter;

public class NthFibonacci {
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder();

        code.append("n = 6\n");
        code.append("a = 0\n");
        code.append("b = 1\n");
        code.append("i = 2\n");
        code.append("while i <= n {\n");
        code.append(" temp = a + b\n");
        code.append(" a = b\n");
        code.append(" b = temp\n");
        code.append(" i = i + 1\n");
        code.append("}\n");
        code.append("puts b\n");

        String input = code.toString();

        Interpreter interpreter = new Interpreter(input);
        interpreter.execute();
    }
}
