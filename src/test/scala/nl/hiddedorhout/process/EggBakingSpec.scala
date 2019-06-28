package nl.hiddedorhout.process
import collection.mutable.Stack
import org.scalatest.FlatSpec

import scala.collection.mutable

class EggBakingSpec extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }
  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[String]
    assertThrows[NoSuchElementException] {
      emptyStack.pop()
    }
  }

//  "a test" should "run" in {
//    assert(true)
//  }

//  override def actorSystemName: String = "eggBaker"
//
//  "A recipe" should "compile" in {
//    val compiledRecipe = getRecipe(defs.Recipes.EggBakingRecipe)
//
//    val (engine, recipeID) = setupEngine(
//      compiledRecipe,
//      Seq(MockInteractions.IngredientObtaining(), MockInteractions.EggBaking())
//    )
//    assert(recipeID === null)
//  }

}
