package nl.hiddedorhout.process

import akka.actor.ActorSystem
import com.ing.baker.compiler.RecipeCompiler
import com.ing.baker.il.CompiledRecipe
import com.ing.baker.recipe.scaladsl._
import com.ing.baker.runtime.core.Baker

trait BakerRuntimeTestBase {
  def actorSystemName: String

  def getRecipe(r: Recipe) = {
    RecipeCompiler.compileRecipe(r)
  }

  type recipeID = String

  def setupEngine(recipe: CompiledRecipe,
                  interactionImpls: Seq[AnyRef]): (Baker, recipeID) = {
    implicit val actorSystem = ActorSystem(actorSystemName)
    val baker = new Baker()(actorSystem)
    baker.addImplementations(interactionImpls)
    val recipeID = baker.addRecipe(recipe)
    (baker, recipeID)
  }
}
