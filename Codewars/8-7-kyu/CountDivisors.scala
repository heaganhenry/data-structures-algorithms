// Count the number of divisors of a positive integer n.
// e.g. 12 --> 6 (1, 2, 3, 4, 6, 12)
// e.g. 5 --> 2 (1, 5)

object Sol {
  def divisors(n: Int): Int = (1 to n).count(n % _ == 0)
}