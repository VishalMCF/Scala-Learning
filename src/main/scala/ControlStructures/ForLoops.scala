package ControlStructures

object ForLoops extends App {
  def forIntro(): Unit = {
    for (i <- List(1,2,3)) println(i)
  }

  def forIntroWithIf(): Unit = {
    for(i <- 1 to 10 if i> 3 if i<6) println(i)
  }

  def forWithYield():Unit = {
    val listOfInts = for(i <- 1 to 10 if i>3 if i<6) yield i*10
    println(listOfInts)
  }

  // forIntro()
  // forIntroWithIf()
//  forWithYield()

}
