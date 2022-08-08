// Given an array of integers your solution should find the smallest integer.

object SmallestIntegerFinder {
  def findSmallestInt(nums:List[Int]):Int =
    nums.foldLeft(Int.MaxValue)((x, y) => x min y)
}