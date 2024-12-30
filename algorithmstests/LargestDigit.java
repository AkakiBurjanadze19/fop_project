package algorithmstests;

import interpretercomponents.Interpreter;

public class LargestDigit {
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder();

        code.append("n = 98753\n");
        code.append("largest_digit = 0\n");
        code.append("while n > 0 {\n");
        code.append(" digit = n % 10\n");
        code.append(" if digit > largest_digit {\n");
        code.append("  largest_digit = digit\n");
        code.append(" }\n");
        code.append(" n = n / 10\n");
        code.append("}\n");
        code.append("puts largest_digit\n");

        String input = code.toString();

        Interpreter interpreter = new Interpreter(input);
        interpreter.execute();
    }
}
