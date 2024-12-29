# VariableStorage Data Structure

## Description
This VariableStorage class which has variables map inside it will be used to store variables and get their corresponding values when necessary.

## internals
### variables map
```Java
 private final Map<String, Object> variables = new HashMap<>();
```
map to store variables where the key is the variable name and the value is the actual value of the variable

### PutVariable method
```Java
 public void PutVariable(String name, Object value) {
  variables.put(name, value);
 }
```
method to assign a value to a named variable

### getVariable method
```Java
 public Object getVariable(String name) {
  if (!variables.containsKey(name)) {
   throw new RuntimeException("Variable not defined: " + name);
  }

  return variables.get(name);
 }
```
method to retrieve the value of a variable by its name

## Examples
### variable assignment and retrieval
```Java
 VariableStorage variables = new VariableStorage();

 variables.PutVariable("x", 12);
 variables.PutVariable("user", "gela");

 int number = (int) variables.getVariable("x")
 String name = (String) variables.getVariable("user")

 System.out.println("number: " + number); // output -> number: 12
 System.out.println("name: " + name); // output -> name: "gela"
```

### handling undefined variables
```Java
 VariableStorage variables = new VariableStorage();

 try {
  variables.getVariable("x");
 } catch (RuntimeException e) {
  System.out.println("Error: " + e.getMessage());
 }

 variables.PutVariable("x", 12);

 int number = (int) variables.getVariable("x");
 System.out.println("number: " + number); // output -> number: 12
```

### updating variable values
```Java
 VariableStorage variables = new VariableStorage();

 variables.PutVariable("user", "gela");
 variables.PutVariable("user", "artura");

 String name = (String) variables.getVariable("user");
 System.out.println("name: " + name); // output -> name: artura
```
