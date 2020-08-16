// LC 88
object MergeSortedArray {

  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var p1 = m - 1
    var p2 = n - 1
    var p = m + n - 1

    while ((p1 >= 0) && (p2 >= 0)) {
      if (nums1(p1) < nums2(p2)) {
        nums1(p) = nums2(p2)
        p -= 1
        p2 -= 1
      } else {
        nums1(p) = nums1(p1)
        p -= 1
        p1 -= 1
      }
    }

    System.arraycopy(nums2, 0, nums1, 0, p2 + 1)
  }
}
