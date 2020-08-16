import org.scalatest.funsuite.AnyFunSuite

class MergeSortedArrayTest extends AnyFunSuite {

  test("testExample1") {
    val nums1 = Array(1, 2, 3, 0, 0, 0)
    val nums2 = Array(2, 5, 6)

    MergeSortedArray.merge(nums1, 3, nums2, 3)

    assert(nums1 sameElements Array(1, 2, 2, 3, 5, 6))
  }
}
