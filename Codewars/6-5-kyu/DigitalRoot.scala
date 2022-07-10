// Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced.

object SumOfDigits {
  def digitalRoot(n: Int): Int = {
    if (n < 10) n
    else digitalRoot(n.toString.map(_.asDigit).sum)
  }
}