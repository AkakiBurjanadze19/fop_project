# Simple Interpreter

## Team Members
1) Akaki Burjanadze - Lead
2) Temo Danelia - Collaborator

This is a simple interpreter implemented in Java which translates and executes Ruby-like code snippets.

## Language Constructs
This is the list of language constructs which our interpreter supports:

* variable assignments
* arithmetic operations (+, -, *, /, %)
* conditional statements (if, else)
* iterative control flow
* printing evaluated statements

## inside an interpreter
Our interpreter doesn't support multi-token expressions, it only supports single-token expression which means that you need to write each statements separately to ensure that it correctly translates and executes the specified code. Also for simplification our interpreter supports `{}` so called curly braces. This is not a feature for Ruby but to note again this was done for simplification and our interpreter executes `Ruby-like` code snippets. For booleans we use `0` and `1`, obviously 0 means false and 1 means true.
What i mean when i say `multi-token` and `single-token` expressions?
For example when you write while loop like this:
```
 while x * x <= n
```
it will not work.
To ensure that it works correctly you need to split statements:
```
line1: `temp = x * x`
line2: `while temp <= n` do something...
```
This will work fine.

## example code snippets
### printing
```
  puts 10
  puts 20
  puts 10 + 20
```

### variable assignments and printing
```
 x = 10
 y = 15

 puts x
 puts y
```
### performing arithmetic operations and printing the results
```
 x = 10
 y = 5

 puts x + y
 puts x - y
 puts x * y
 puts x / y
 puts x % y
```
### evaluating conditional statements
```
 x = 10
 y = 5

 if x > y {
  puts x
 } else {
  puts y
 }
```
### iterative control flow
looping upwards
```
 x = 0
 while x < 5 {
  puts x
  x = x + 1
 }
```
looping backwards
```
 x = 5
 while x > 0 {
  puts x
  x = x - 1
 }
```
breaking out of the loop
```
  x = 0
  while x < 5 {
   puts x
   x = x + 1
   if x > 3 {
    break
   }
  }
```

## example algorithm
we can create a program which calculates the sum from `1...n`
```
 i = 1
 n = 5
 sum = 0

 while i <= n {
  sum = sum + i
  i = i + 1
 }

 puts sum 
```
  
## How to run the project
first of all make sure that on your computer you have have installed `Java` and `git`. If you have Java and git installed on your computer, follow the instructions:
* Open the terminal, if you are using Windows that's `powershell` and change the directory to desktop by typing `cd Desktop`.
* Go to the project repository in GitHub and copy the repo url which can be found under the green `code` button.
* After copying the repistory url, open the terminal again and type `git clone {repository_url}`. `{repository_url}` must be the actual repository url
* After cloning the repository, change directory to the cloned project by typing `cd {cloned_project}`. `{cloned_project}` must be the actual cloned project directory
* Now when you are inside the cloned project, change directory to `interpretercomponents` by typing `cd interpretercomponents` and compile everything there by running `javac {.java file}`.
* Now change directory to `algorithmstests` by running `cd..` and then by running `cd algorithmstests` and compile everything there as well by executing `javac {.java file}`. This will create bytecode executable files
* After compiling Java classes in the `algorithmstests` package you can run the actual code now by typing `java {bytecode_executable_file}`

Alternatively you can run the code without doing all of these. For example if you are using `IntellJ IDE` just clone the repository and then open it by the IDE. Build the project and run the specific code.
