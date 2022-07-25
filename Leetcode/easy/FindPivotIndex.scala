// The pivot index of an array is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// Given an array of integers nums, calculate the pivot index. If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
// Time O(n), Space O(n)

object Solution {
    def pivotIndex(nums: Array[Int]): Int = {
        val totalSum = nums.sum
        val leftSums = nums.scanLeft(0)(_ + _)

        leftSums.zip(nums).indexWhere {
            case (left, num) => left == totalSum - num - left
        }
    }
}