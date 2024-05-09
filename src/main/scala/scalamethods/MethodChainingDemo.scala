package scalamethods

import scalamethods.MethodsArgumentDemo.Pizza
import scalamethods.enums.Toppings
import scalamethods.enums.Toppings.Toppings

object MethodChainingDemo extends App {

  class CustomPizza extends Pizza {
    private var toppings = Vector.empty[Toppings]

    def printToppings(): Unit = {
      toppings.foreach(println)
    }

    def addTopping(topping: Toppings): this.type = {
      toppings = this.toppings.appended(topping)
      this
    }

    def removeTopping(topping: Toppings): this.type = {
      this.toppings.filter((currentTopping) => currentTopping.equals(topping))
      this
    }
  }

  def demonstrate_method_chaining_in_Scala(): Unit = {
    val pizza = new CustomPizza
    pizza.addTopping(Toppings.TOMATO_SLICE)
      .addTopping(Toppings.CAPSICUM)
      .addTopping(Toppings.MEATBALLS)
      .addTopping(Toppings.SOY_BALLS)
    pizza.printToppings()
  }

  demonstrate_method_chaining_in_Scala()
}
