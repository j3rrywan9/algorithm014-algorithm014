import org.scalatest.funsuite.AnyFunSuite

class RemoveDuplicatesFromSortedArrayTest extends AnyFunSuite {

  test("testExample1") {
    assert(RemoveDuplicatesFromSortedArray.removeDuplicates(Array(1, 1, 2)) == 2)
  }

  test("testExample2") {
    assert(RemoveDuplicatesFromSortedArray.removeDuplicates(Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)) == 5)
  }
}
