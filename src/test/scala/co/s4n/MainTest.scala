package co.s4n

import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("Hello world!") {
    info("Hello world")
    assert("Hello world" === Main.m())
  }

  test("bestMovie") {
    val votes = Seq(("thor", 1), ("cars", 20), ("monster inc", 10), ("the revenant", 50))
    assert("the revenant" === Main.bestMovie(votes))
  }

  test("mostMoviesByDirector") {
    val votes = Seq(("thor", 1), ("cars", 20), ("monster inc", 60), ("the revenant", 50))
    assert("monster inc" === Main.mostMoviesByDirector(votes))
  }



}
