import org.scalatest.funsuite.AnyFunSuite

class PlusOneTest extends AnyFunSuite {

  test("testExample1") {
    assert(PlusOne.plusOne(Array(1, 2, 3)) sameElements Array(1, 2 ,4))
  }

  test("testExample2") {
    assert(PlusOne.plusOne(Array(4, 3, 2, 1)) sameElements Array(4, 3, 2, 2))
  }
}
