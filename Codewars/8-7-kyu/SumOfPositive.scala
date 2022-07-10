// Given an array of numbers, return the sum of all of the positives ones.

object SumOfPositive {
  def positiveSum(arr: Array[Int]): Int = arr.filter(_ > 0).sum
}