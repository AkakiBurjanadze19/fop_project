package algorithmstests;
import interpretercomponents.Interpreter;
public class ReverseNumber {
    public static void main(String[] args){
        StringBuilder code = new StringBuilder();

        code.append("n = 12345\n");
        code.append("reversed = 0\n");
        code.append("while n != 0 {\n");
        code.append(" digit = n % 10\n");
        code.append(" reversed = reversed * 10 + digit\n");
        code.append(" n = n / 10\n");
        code.append("}\n");
        code.append("puts reversed\n");

        Interpreter interpreter = new Interpreter(code.toString());
        interpreter.execute();
    }
}
