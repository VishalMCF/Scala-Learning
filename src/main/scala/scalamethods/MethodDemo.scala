package scalamethods

object MethodDemo extends App {

  // a simple method to add two integers and return the sum
  def addTwoIntegers(a: Int, b: Int): Int = {
    a + b
  }

  println(addTwoIntegers(4, 5))
}
