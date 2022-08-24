// Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times.
// Time O(n), Space O(n)

object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        val length = nums.length
        val freqMap = nums.groupBy(identity).view.mapValues(_.length).toMap
        nums.find(freqMap(_) > length / 2).getOrElse(-1)
    }
}