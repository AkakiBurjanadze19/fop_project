package algorithmstests;
import interpretercomponents.Interpreter;

public class Sum {
    public static void main(String[] args){

        StringBuilder code = new StringBuilder();

        code.append("n = 5\n");
        code.append("sum = 0\n");
        code.append("x = 1\n");
        code.append("while x <= n {\n");
        code.append(" sum = sum + x\n");
        code.append(" x = x + 1\n");
        code.append("}\n");
        code.append("puts sum\n");

        Interpreter interpreter = new Interpreter(code.toString());
        interpreter.execute();
    }
}
