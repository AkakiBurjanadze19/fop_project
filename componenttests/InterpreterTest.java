package componenttests;

import interpretercomponents.Interpreter;

public class InterpreterTest {
    public static void main(String[] args){
        StringBuilder code1 = new StringBuilder();
        code1.append("puts 10+20");

        Interpreter interpreter = new Interpreter(code1.toString());
        interpreter.execute();

        StringBuilder code2 = new StringBuilder();
        code2.append("puts 20-10");

        Interpreter interpreter2 = new Interpreter(code2.toString());
        interpreter2.execute();

        StringBuilder code3 = new StringBuilder();
        code3.append("puts 20*10");

        Interpreter interpreter3 = new Interpreter(code3.toString());
        interpreter3.execute();

        StringBuilder code4 = new StringBuilder();
        code4.append("puts 20/10");

        Interpreter interpreter4 = new Interpreter(code4.toString());
        interpreter4.execute();

        StringBuilder code5 = new StringBuilder();
        code5.append("puts 20%10");

        Interpreter interpreter5 = new Interpreter(code5.toString());
        interpreter5.execute();

        StringBuilder code6 = new StringBuilder();
        code6.append("x=5");
        code6.append("puts x");

        Interpreter interpreter6 = new Interpreter(code6.toString());
        interpreter6.execute();

        StringBuilder code7 = new StringBuilder();
        code7.append("x=10\n");
        code7.append("if x>5 {\n");
        code7.append("puts x\n");
        code7.append("}");

        Interpreter interpreter7 = new Interpreter(code7.toString());
        interpreter7.execute();

        StringBuilder code8 =new StringBuilder();
        code8.append("x = 10\n");
        code8.append("if x < 5 {\n");
        code8.append("puts x\n");
        code8.append("}\n");
        code8.append("else {\n");
        code8.append("puts 250\n");
        code8.append("}");

        Interpreter interpreter8 = new Interpreter(code8.toString());
        interpreter8.execute();

        StringBuilder code9 =new StringBuilder();
        code9.append("x=0");
        code9.append("while x<5 {\n");
        code9.append("puts x\n");
        code9.append("x=x+1\n");
        code9.append("}");

        Interpreter interpreter9 = new Interpreter(code9.toString());
        interpreter9.execute();

        StringBuilder code10 =new StringBuilder();
        code10.append("x=5");
        code10.append("while x>0 {\n");
        code10.append("puts x\n");
        code10.append("x=x-1\n");
        code10.append("}");

        Interpreter interpreter10 = new Interpreter(code10.toString());
        interpreter10.execute();

        StringBuilder code11 =new StringBuilder();
        code11.append("x=0");
        code11.append("while x<5 {\n");
        code11.append("puts x\n");
        code11.append("x=x+1\n");
        code11.append("if x>3 {\n");
        code11.append("break\n");
        code11.append("}");
        code11.append("}");

        Interpreter interpreter11 = new Interpreter(code11.toString());
        interpreter11.execute();

    }
}
