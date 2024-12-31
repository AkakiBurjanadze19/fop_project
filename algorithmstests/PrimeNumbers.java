package algorithmstests;

import interpretercomponents.Interpreter;

public class PrimeNumbers {
    public static void main(String[] args){
        StringBuilder code = new StringBuilder();

        code.append("n = 29\n");
        code.append("is_prime = 1\n");
        code.append("if n <= 1 {\n");
        code.append("  is_prime = 0\n");
        code.append("} else {\n");
        code.append("  x = 2\n");
        code.append("  temp = x * x\n");
        code.append("  while temp <= n {\n");
        code.append("    rem = n % x\n");
        code.append("    if rem == 0 {\n");
        code.append("      is_prime = 0\n");
        code.append("      break\n");
        code.append("    }\n");
        code.append("    x = x + 1\n");
        code.append("    temp = x * x\n");
        code.append("  }\n");
        code.append("}\n");
        code.append("puts is_prime\n");

        Interpreter interpreter = new Interpreter(code.toString());
        interpreter.execute();
    }
}
