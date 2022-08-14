// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Time O(n), Space O(1)

object Solution {
    def missingNumber(nums: Array[Int]): Int = {
        val numsSum = nums.sum
        val wholeSum = (0 to nums.length).sum

        wholeSum - numsSum
    }
}