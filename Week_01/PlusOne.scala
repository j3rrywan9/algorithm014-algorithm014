// LC 66
object PlusOne {

  def plusOne(digits: Array[Int]): Array[Int] = {
    val n = digits.length

    for (index <- n - 1 to 0 by -1) {
      if (digits(index) == 9) {
        digits(index) = 0
      } else {
        digits(index) += 1
        return digits
      }
    }

    val digitsPlusOne = Array.fill[Int](n + 1)(0)
    digitsPlusOne(0) = 1

    digitsPlusOne
  }
}
