// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
// Time O(n), Space O(n)

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        @annotation.tailrec
        def twoSumRec(numsMap: Map[Int, Int], curIndex: Int): Array[Int] = {
            val diff = target - nums(curIndex)
            if (numsMap.contains(diff)) Array(numsMap(diff), curIndex)
            else twoSumRec(numsMap + (nums(curIndex) -> curIndex), curIndex + 1)
        }

        twoSumRec(Map(), 0)
    }
}