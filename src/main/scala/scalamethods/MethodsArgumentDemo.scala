package scalamethods

import scalamethods.enums.CrustSize.CrustSize
import scalamethods.enums.CrustThickness.CrustThickness
import scalamethods.enums.{CrustSize, CrustThickness}

object MethodsArgumentDemo extends App {

  private class Pizza {
    private var crustSize: enums.CrustSize.Value = CrustSize.Medium
    private var crustType: enums.CrustThickness.Value = CrustThickness.Medium

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
