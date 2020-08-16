// LC 189
object RotateArray {

  def rotate(nums: Array[Int], k: Int): Unit = {
    if (nums == null || nums.length < 2) {
      return
    }

    val n = nums.length
    // k could be larger than array length
    val r = k % nums.length

    reverse(nums, 0, n - r - 1)
    reverse(nums, n - k, n - 1)
    reverse(nums, 0, n - 1)
  }

  private def reverse(nums: Array[Int], start: Int, end: Int): Unit = {
    var i = start
    var j = end

    while (i < j) {
      val temp = nums(i)

      nums(i) = nums(j)
      nums(j) = temp

      i += 1
      j -= 1
    }
  }
}
