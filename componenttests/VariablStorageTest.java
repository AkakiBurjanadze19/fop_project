package componenttests;
import interpretercomponents.VariableStorage;
public class VariablStorageTest {
    public static void main(String[] args){

        VariableStorage variables = new VariableStorage();
        variables.PutVariable("user", "abc");
        variables.PutVariable("user","ilia");
        String name = (String) variables.getVariable("user");
        System.out.println("name: " + name);


    }
}
