# Contributors
1. Akaki Burjandze - Lead
2. Temo Danelia - Collaborator

## description
For productivity reasons we split the tasks. One person was responsible for designing (writing) code for different components for the interpreter and another person was responsible for writing tests for those components and for the algorithms which were tested using the interpreter. 

## Akaki Burjanadze
Worked on the main components of the interpreter.
* wrote code for the `Token` class (data structure) which is used to represent tokens in the interpreter
* wrote code for the `VariableStorage` class which is responsible for storing and retrieving variable values
* wrote code for the `Tokenizer` class which is responsible for identyfing and collecting different types of tokens from the input code
* wrote code for the `Interpreter` class which combines everything and is responsible for translating generated tokens and evaluating the actual result from that
* wrote code for the `BreakException` class which is used for `break` functionality inside while loops
* wrote code for some tests and modified some of them

## Temo Danelia
Worked mainly on the testing of different components and also suggested some modifications and ideas for the interpreter components.
* wrote code for testing the `Token` class (data structure)
* wrote code for testing the `Tokenizer`
* wrote code for testing the `Interpreter`
* wrote code for testing the `VariableStorage`
* wrote code for testing the different algorithms
