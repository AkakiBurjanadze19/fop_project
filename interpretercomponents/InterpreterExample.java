package interpretercomponents;

public class InterpreterExample {
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder();

        code.append("x = 0\n");
        code.append("while x < 5 {\n");
        code.append("puts x\n");
        code.append("x = x + 1\n");
        code.append("if x > 3 {\n");
        code.append("break\n");
        code.append("}\n");
        code.append("}");

        Interpreter interpreter = new Interpreter(code.toString());
        interpreter.execute();
    }
}
