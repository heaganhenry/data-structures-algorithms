// Given an array of integers, find the one that appears an odd number of times. There will always be only one integer that appears an odd number of times.

object FindTheOddInt {
  def findOdd(xs: Seq[Int]): Int =
    xs.find(x => xs.count(_ == x) % 2 != 0).get
}