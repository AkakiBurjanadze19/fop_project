package algorithmstests;
import interpretercomponents.Interpreter;
public class Fibonacci {
    public static void main(String[] args){

        StringBuilder code = new StringBuilder();
        code.append("a = 48\n");
        code.append("b = 18\n");
        code.append("while b != 0 {\n");
        code.append(" temp = b\n");
        code.append(" b = a % b\n");
        code.append(" a = temp\n");
        code.append("}\n");
        code.append("puts a\n");

        Interpreter interpreter = new Interpreter(code.toString());
        interpreter.execute();
    }
}
