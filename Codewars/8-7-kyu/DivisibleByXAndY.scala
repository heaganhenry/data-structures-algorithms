// Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.

object Kata {
  def isDivisible(n: Int, x: Int, y: Int): Boolean =
    n % x == 0 && n % y == 0
}