package ControlStructures

import scala.util.matching.Regex.Match

object ForLoops extends App {
  def forIntro(): Unit = {
    for (i <- List(1, 2, 3)) println(i)
  }

  def forIntroWithIf(): Unit = {
    for (i <- 1 to 10 if i > 3 if i < 6) println(i)
  }

  def forWithYield(): Unit = {
    val listOfInts = for (i <- 1 to 10 if i > 3 if i < 6) yield i * 10
    println(listOfInts)
  }

  def forWithYieldUsingStringExample(): Unit = {
    val someStringValue = "Hey How are you? COmo Estas? Tu hablo espanol?"
    val characters = for (i <- 0 until someStringValue.length) yield someStringValue.charAt(i).toUpper
    println(characters)
  }

  def exceptionHandlingExample(): Unit = {
    def toInt(s: String): Option[Int] = {
      try
        Some(s.toInt)
      catch {
        case e: NumberFormatException => None
      }
    }

    println(toInt("1"))
    println(toInt("Yo"))
  }

  def whileLoopExample(): Unit = {
    var i = 1
    while (i < 11) {
      print(i.+(" "))
      i += 1
    }
  }

  forIntro()
  forIntroWithIf()
  forWithYield()
  forWithYieldUsingStringExample()
  exceptionHandlingExample()
  whileLoopExample()

}
