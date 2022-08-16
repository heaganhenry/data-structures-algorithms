// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
// Time O(n), Space O(1)

object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        nums.tail.foldLeft((nums(0), nums(0))) { case ((cur, max), num) => {
          val curMax = Math.max(cur + num, num)
          val maxMax = Math.max(max, curMax)
          (curMax, maxMax)
        }}._2
    }
}