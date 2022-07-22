// Given an integer array nums, return true if the given array is monotonic (either monotone increasing or monotone decreasing), or false otherwise.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Time O(n), Space O(1)

object Solution {
    def isMonotonic(nums: Array[Int]): Boolean = {
        val deltas = nums.zip(nums.tail).map { case (l, r) => l - r }
        deltas.forall(_ >= 0) || deltas.forall(_ <= 0)
    }
}