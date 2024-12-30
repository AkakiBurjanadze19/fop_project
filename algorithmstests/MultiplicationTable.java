package algorithmstests;
import interpretercomponents.Interpreter;

public class MultiplicationTable {
    public static void main(String[] args){
        StringBuilder code = new StringBuilder();

        code.append("n = 5\n");
        code.append("i = 1\n");
        code.append("while i <= 10 {\n");
        code.append(" result = n * i\n");
        code.append(" puts result\n");
        code.append(" i = i + 1\n");
        code.append("}\n");

        String input = code.toString();

        Interpreter interpreter = new Interpreter(input);
        interpreter.execute();
    }
}
