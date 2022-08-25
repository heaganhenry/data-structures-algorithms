// Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times.
// Time O(n), Space O(1)

object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        nums.foldLeft((0, 0)) { case ((res, count), num) => {
            val r = if (count == 0) num else res
            val c = if (r == num) count + 1 else count - 1
            (r, c)
        }}._1
    }
}