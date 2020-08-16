import org.scalatest.funsuite.AnyFunSuite

class RotateArrayTest extends AnyFunSuite {

  test("testExample1") {
    val nums = Array(1, 2, 3, 4, 5, 6, 7)

    RotateArray.rotate(nums, 3)

    assert(nums sameElements Array(5, 6, 7, 1, 2, 3, 4))
  }

  test("testExample2") {
    val nums = Array(-1, -100, 3, 99)

    RotateArray.rotate(nums, 2)

    assert(nums sameElements Array(3, 99, -1, -100))
  }
}
