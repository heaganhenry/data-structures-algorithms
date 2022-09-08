// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
// Time O(n), Space O(n)

object Solution {
    def getConcatenation(nums: Array[Int]): Array[Int] =
        nums ++ nums // or Array(nums, nums).flatten
}