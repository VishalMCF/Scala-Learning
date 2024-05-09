Basic structure of the method in scala:-
def functionName ([list of parameters]) : [return type] = {
    function body
    value_to_return
}

Example:- 
def addInt (a: Int, b:Int): Int = {
    a+b
}

When a method is declared as final it means any class which is inheriting the class in which the method is declared 
cannot override them.

Different Scopes of methods in Scala:-
1. Private
2. Protected
3. Package

Various Situations When a Method call is made from a class which inherits any trait
or superclass:-
1. A method in a class does not have the method with the same name as present in the
super class. The you can call that superclass method without using the keyword 'super'
2. Method with same name as that in the superclass needs to call that superclass method
3. A method in a class has the same name as multiple traits that it extends and you want to 
choose which trait behaviour you have to choose. In this situation you can choose the trait name too
whose method should be called
4. Methods can be overridden by adding the 'override' keyword.