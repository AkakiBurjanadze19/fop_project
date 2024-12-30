package algorithmstests;

import interpretercomponents.Interpreter;

public class SumOfDigits {
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder();

        code.append("n = 12345\n");
        code.append("sum = 0\n");
        code.append("while n > 0 {\n");
        code.append(" digit = n % 10\n");
        code.append(" sum = sum + digit\n");
        code.append(" n = n / 10\n");
        code.append("}\n");
        code.append("puts sum\n");

        String input = code.toString();

        Interpreter interpreter = new Interpreter(input);
        interpreter.execute();
    }
}
