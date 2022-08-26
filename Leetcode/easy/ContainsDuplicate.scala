// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Time O(n), Space O(n)

object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        nums.groupBy(identity).mapValues(_.size).find(pair => pair._2 > 1).isDefined
    }
}