// You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.

object Parity {
  def findOutlier(integers: List[Int]): Int = {
    val (even, odd) = integers.partition(_ % 2 == 0)
    if (even.size == 1) even.head else odd.head
  }
}