// Given an initial sequence of integers and an integer n, write a function that returns a list containing the first n numbers of the Tribonacci sequence
// Tribonnaci is created using the sum of the last 3 numbers of the sequence to generate the next e.g. [1, 1 ,1, 3, 5, 9, 17, 31]

object Tribonacci {
  def tribonacci[T: Numeric](signature: List[T], n: Int): List[T] = {
    if (n <= 3) signature.take(n)
    else {
      val prev = tribonacci(signature, n - 1)
      prev ::: List(prev.reverse.take(3).sum)
    }
  }
}