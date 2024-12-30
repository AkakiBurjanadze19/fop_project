package algorithmstests;
import interpretercomponents.Interpreter;
public class Sum {
    public static void main(String[] args){

        StringBuilder code = new StringBuilder();
        code.append("n = 5\n");               // Define the number n (you can change this to test with other values)
        code.append("sum = 0\n");             // Initialize the sum variable to 0
        code.append("x = 1\n");               // Start from 1
        code.append("while x <= n {\n");      // Loop until x exceeds n
        code.append(" sum = sum + x\n");      // Add the current value of x to sum
        code.append(" x = x + 1\n");          // Increment x
        code.append("}\n");
        code.append("puts sum\n");            // Output the final sum

        Interpreter interpreter = new Interpreter(code.toString());
        interpreter.execute();
    }
}
