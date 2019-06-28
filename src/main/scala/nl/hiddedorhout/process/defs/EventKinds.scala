package nl.hiddedorhout.process.defs

import com.ing.baker.recipe.scaladsl.Event

object EventKinds {
  val EggOrderPlaced = Event("EggOrderPlaced", IngredientKinds.EggOrder)
  val IngredientsObtained =
    Event("IngredientsObtained", IngredientKinds.Ingredients)
  val EggsBaked = Event("EggsBaked", IngredientKinds.BakedEggs)
}
