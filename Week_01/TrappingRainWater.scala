import scala.math.max

// LC 42
object TrappingRainWater {

  def trap(height: Array[Int]): Int = {
    if (height.length == 0) {
      return 0
    }

    val n = height.length
    var left = 0
    var right = n - 1
    var maxLeft = height(left)
    var maxRight = height(right)
    var ans = 0

    while (left < right) {
      if (maxLeft < maxRight) {
        ans += maxLeft - height(left)
        left += 1
        maxLeft = max(maxLeft, height(left))
      } else {
        ans += maxRight - height(right)
        right -= 1
        maxRight = max(maxRight, height(right))
      }
    }

    ans
  }
}
