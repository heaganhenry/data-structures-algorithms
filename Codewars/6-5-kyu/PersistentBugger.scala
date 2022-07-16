// Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

object Multiplication {
  def persistence(n: Int, i: Int = 0): Int =
    if (n > 9) persistence(n.toString.map(_.asDigit).product, i + 1) else i
}