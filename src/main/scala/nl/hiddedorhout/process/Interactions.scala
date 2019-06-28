package nl.hiddedorhout.process

import nl.hiddedorhout.process.defs.InteractionKinds
import nl.hiddedorhout.process.impls.Events

object Interactions {
  case class IngredientObtaining() {
    def name: String = InteractionKinds.IngredientObtaining.name

    def apply(EggOrder: String): Events.IngredientsObtained =
      Events.IngredientsObtained("Eggs and butter")
  }

  case class EggBaking() {
    def name: String = InteractionKinds.EggBaking.name

    def apply(Ingredients: String): Events.EggsBaked =
      Events.EggsBaked("Baked Eggs")
  }
}
