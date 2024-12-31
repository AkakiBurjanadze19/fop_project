package algorithmstests;

import interpretercomponents.Interpreter;

public class PalindromeCheck {
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder();

        code.append("n = 121\n");
        code.append("original_n = n\n");
        code.append("reversed = 0\n");
        code.append("while n > 0 {\n");
        code.append(" digit = n % 10\n");
        code.append(" reversed = reversed * 10\n");
        code.append(" reversed = reversed + digit\n");
        code.append(" n = n / 10\n");
        code.append("}\n");
        code.append("if original_n == reversed {\n");
        code.append(" puts 1\n");
        code.append("} else {\n");
        code.append(" puts 0\n");
        code.append("}\n");

        String input = code.toString();

        Interpreter interpreter = new Interpreter(input);
        interpreter.execute();

    }
}
