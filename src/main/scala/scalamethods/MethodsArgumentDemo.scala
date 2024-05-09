package scalamethods

import scalamethods.enums.CrustSize.CrustSize
import scalamethods.enums.CrustThickness.CrustThickness
import scalamethods.enums.{CrustSize, CrustThickness}

object MethodsArgumentDemo extends App {

  private class Pizza {
    var crustSize = CrustSize.Medium
    var crustType = CrustThickness.Medium

    def updatePizza(crustSize: CrustSize = CrustSize.Large, crustType: CrustThickness = CrustThickness.SuperThick): Unit = {
      this.crustType = crustType
      this.crustSize = crustSize
    }

    def printPizza(): Unit = {
      println(" crust thickness => "+ this.crustType + " crust size => " + this.crustSize)
    }
  }

  private def demonstrate_method_default_arguments(): Unit = {
    val pizza = new Pizza()
    pizza.updatePizza(CrustSize.FamilyLarge, CrustThickness.Thin)
    pizza.printPizza()
  }

  demonstrate_method_default_arguments()
}
