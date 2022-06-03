// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Time O(n), Space O(n)

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        def findPair(curIndex: Int, numsMap: Map[Int, Int]): Array[Int] = {
            val diff = target - nums(curIndex)
            if (numsMap.contains(diff)) Array(numsMap(diff), curIndex)
            else findPair(curIndex + 1, numsMap + (nums(curIndex) -> curIndex))
        }

        findPair(0, Map[Int, Int]())
    }
}