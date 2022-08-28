// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Time O(n), Space O(n)

object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        @annotation.tailrec
        def containsRec(nums: Array[Int], set: Set[Int]): Boolean = {
            if (nums.isEmpty) false
            else if (set.contains(nums.head)) true
            else containsRec(nums.tail, set + nums.head)
        }

        containsRec(nums, Set())
    }
}