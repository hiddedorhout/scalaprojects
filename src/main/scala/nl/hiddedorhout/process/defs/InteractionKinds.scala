package nl.hiddedorhout.process.defs

import com.ing.baker.recipe.scaladsl.Interaction

object InteractionKinds {
  val IngredientObtaining = Interaction(
    name = "IngredientObtaining",
    inputIngredients = Seq(IngredientKinds.EggOrder),
    output = Seq(EventKinds.IngredientsObtained)
  )
  val EggBaking = Interaction(
    name = "EggBaking",
    inputIngredients = Seq(IngredientKinds.Ingredients),
    output = Seq(EventKinds.EggsBaked)
  )
}
