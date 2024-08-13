# Scala REPL

### Basic Features of Scala REPL
1. How to launch the REPL => type scala in terminal
2. REPL also shows the datatype of the result
3. If no variables are defined then scala will create its own variable and output the result
Examples:-
```scala
val x = 1           // type this single line on shell
val y = 2           // type this single line on shell
x + y               // type this single line on shell
val x = List(1,2,3) // type this single line on shell
x.sum               // type this single line on shell
```
4. Use Tab completion to see the available methods
5. Use getClass method to get the type of the variables
```scala
val x = (3, "Three", 3.0)
x.getClass
```
6. How to Load Scala Files into REPL
```scala
:load models/Person.scala
```
7. If the source files contains packages then it can't be used like above. 
For that you have to create jar files and then include it in the classPath.