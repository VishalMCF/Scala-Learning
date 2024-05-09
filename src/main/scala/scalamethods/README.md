### Methods in Scala

### Basic Structure of Method in Scala
Demo Object Name -> **MethodDemo**
```scala
def functionName([list of parameters]): [return type] = {
  // function body
  value_to_return
}


**Example:**
def addInt(a: Int, b: Int): Int = {
  a + b
}
```

When a method is declared as `final`, it means any class which is inheriting the class in which the method is declared cannot override them.

### Different Scopes of Methods in Scala

1. **Private**
2. **Protected**
3. **Package**

### Situations When a Method Call is Made from a Class Which Inherits Any Trait or Superclass
Demo Object Name -> **InheritedMethodsDemo**

1. A method in a class does not have the method with the same name as present in the superclass. Then you can call that superclass method without using the keyword `super`.
2. Method with the same name as that in the superclass needs to call that superclass method.
3. A method in a class has the same name as multiple traits that it extends and you want to choose which trait behavior you have to choose. In this situation, you can choose the trait name too whose method should be called.
4. Methods can be overridden by adding the `override` keyword.

Demo Object Name -> **MethodArgumentsDemo**
Method parameter names can also be mentioned when you are calling the method. Separate the method name and the argument value using the `:`.

Default values for the parameters in the method can also be set using the following format:
```scala
parametername: parametertype = defaultValue
```

Methods with variable arguments can also be created. The field is called varargs fieldType. Varargs field type can be created using the `*` character after the field type.

```scala
def printAll(values: String*) = strings.foreach(println)
```

If the various arguments are stored in a sequence type, then you can't use varargs using the `*` operator. `_*` must be used.

**For example:**
```scala
val fruits = List("apple", "mango", "banana")
printAll(fruits) // this will fail and won't work
printAll(fruits: _*) // `_*` is equivalent to Splat just like in Unix
```

The varargs field should be defined as the last parameter in the method declaration if the methods has more than 
one parameters. If this is not the case then scala will throw the error.

Method can also be declared that they throw exceptions, by using the following syntax:-

```scala
 
  @throws(classof[Exception])
  def play
    /// exception code being written here
```

Method chaining can be used to create a fluent style of programming . For eg:-

```scala
person.setFirstName("something")
  .setLastName("something else")
  .setAge(85)
  .setCity("Manassas")
  .setState("Virginia")
```
If the class can be extended specify this.type as the return type in the method
If the class can not be extended then return this or this.type as the return type in the methods

Methods can be added to the Closed classes to enhance their behaviour based on the
custom use-case. This can be done using the extension keyword.
```scala
extension (s: String)
  def hello:String = s"Hello, ${s.capitalize}"
```
Multiple extension methods can be defined by putting them all under the extension keyword