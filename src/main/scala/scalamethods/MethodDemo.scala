package scalamethods

object MethodDemo extends App {

  // a simple method to add two integers and return the sum
  def addTwoIntegers(a: Int, b: Int): Int = {
    a + b
  }

  // with return type
  def isBetweenA(a: Int, x: Int, y: Int): Boolean = a >= x && a <= y

  def maxNumberA(a: Int, b: Int): Int = if (a > b) a else b

  // without return type
  def isBetweenB(a: Int, x: Int, y: Int) = a >= x && a <= y

  def maxNumberB(a: Int, b: Int) = if (a > b) a else b

  println(addTwoIntegers(4, 5))
  println(isBetweenA(3, 4, 5))
  println(isBetweenB(3, 4, 5))
  println(maxNumberB(3, 4))
  println(maxNumberA(3, 4))
}
