package interpretercomponents;

import java.util.HashMap;
import java.util.Map;

public class VariableStorage {

    public class VariableEnvironment {
        private Map<String, Object> variables = new HashMap<>();

        public void PutVariable(String name, Object value) {
            variables.put(name,value);
        }

        public Object getVariable(String name) {
           if (!variables.containsKey(name)){
               throw new RuntimeException("Variable not defined " + name);
           }
           return variables.get(name);
        }
    }
}
