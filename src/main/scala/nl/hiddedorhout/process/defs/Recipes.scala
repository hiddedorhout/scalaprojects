package nl.hiddedorhout.process.defs

import com.ing.baker.recipe.scaladsl.Recipe

object Recipes {
  val EggBakingRecipe = Recipe("EggBakingRecipe ")
    .withSensoryEvents(EventKinds.EggOrderPlaced)
    .withInteractions(
      InteractionKinds.IngredientObtaining,
      InteractionKinds.EggBaking
    )
}
