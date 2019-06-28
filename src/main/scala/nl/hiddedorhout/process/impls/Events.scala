package nl.hiddedorhout.process.impls

object Events {
  case class EggOrderPlaced(EggOrder: String)
  case class IngredientsObtained(Ingredients: String)
  case class EggsBaked(BakedEggs: String)
}
