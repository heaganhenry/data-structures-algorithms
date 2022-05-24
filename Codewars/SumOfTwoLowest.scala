// Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 positive integers. No floats or non-positive integers will be passed.

object Kata {

  def sumTwoSmallest(numbers: List[Int]): Int =
    numbers.sorted.take(2).sum
}