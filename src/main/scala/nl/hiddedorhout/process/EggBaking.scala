package nl.hiddedorhout.process

import akka.actor.ActorSystem
import com.ing.baker.compiler.RecipeCompiler
import nl.hiddedorhout.process.impls.Events.EggOrderPlaced

object EggBaking extends App {
  val r = RecipeCompiler.compileRecipe(defs.Recipes.EggBakingRecipe)
  println(r.getRecipeVisualization)

  import com.ing.baker.runtime.core.Baker

  val processId = "processId"

  implicit protected val actorSystem = ActorSystem("eggBaking")
  val baker = new Baker()(actorSystem)

  baker.addImplementation(Interactions.IngredientObtaining())
  baker.addImplementation(Interactions.EggBaking())

  val recipeID = baker.addRecipe(r)

  baker.bake(recipeID, processId)

  baker.processEvent(processId, EggOrderPlaced("an order"))
  println(baker.getVisualState(processId))
}
