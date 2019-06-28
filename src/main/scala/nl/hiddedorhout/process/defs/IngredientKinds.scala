package nl.hiddedorhout.process.defs

import com.ing.baker.recipe.scaladsl.Ingredient

object IngredientKinds {
  val EggOrder = Ingredient[String](name = "EggOrder")
  val Ingredients = Ingredient[String](name = "Ingredients")
  val BakedEggs = Ingredient[String](name = "BakedEggs")
}
