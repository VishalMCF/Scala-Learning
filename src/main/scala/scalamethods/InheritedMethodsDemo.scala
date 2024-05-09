package scalamethods

object InheritedMethodsDemo extends App {

  trait Human {
    def yo(): String = "Human"
  }

  trait Mother extends Human {
    override def yo(): String = "Mother"
  }

  trait Father extends Human {
    override def yo(): String = "Father"
  }

  class Child extends Father with Mother with Human {
    def printSuper: String = super.yo()
    def printMother: String = super[Mother].yo()
    def printFather: String = super[Father].yo()
    def printHuman: String = super[Human].yo()

    override def yo(): String = {
      printSuper + " " + printHuman + " " + printMother + " " + printFather
    }
  }

  class AnimalWithLegs {
    def walk(): Unit = println("The animal is walking")

    def run(): Unit = println("The animal is running")
  }

  private class Dog extends AnimalWithLegs {
    def walkThenRun(): Unit = {
      walk()
      run()
    }

    // override the method present in the super class
    override def walk() = {
      super.walk()
      println("Dog is also walking")
    }
  }

  private def method_to_demonstrate_inheritance_with_different_method_name(): Unit = {
    val dog = new Dog()
    dog.walkThenRun()
  }

  private def method_to_demonstrate_inheritance_with_same_method_name(): Unit = {
    val dog = new Dog()
    dog.walk()
  }

  private def method_to_demonstrate_multiple_trait_inheritance_and_calling_mthod_name():Unit = {
    val child = new Child()
    println(child.yo())
  }

  method_to_demonstrate_inheritance_with_different_method_name()
  method_to_demonstrate_inheritance_with_same_method_name()
  method_to_demonstrate_multiple_trait_inheritance_and_calling_mthod_name()
}
