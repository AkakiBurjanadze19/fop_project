import java.util.HashMap;
import java.util.Map;

public class VariableStorage {
    // create a variables map where variables and their corresponding values will be stored
    private final Map<String, Object> variables = new HashMap<>();

    // define a method which will be used to put variables into a variables map
    public void PutVariable(String name, Object value) {
        variables.put(name,value);
    }

    // define a getter method for getting variable values from variables map
    public Object getVariable(String name) {
        if (!variables.containsKey(name)) {
            throw new RuntimeException("Variable not defined " + name);
        }

        return variables.get(name);
    }
}
