// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
// Time O(n), Space O(n)

const twoSum = function(nums, target) {
    let obj = {}

    for (let i = 0; i < nums.length; i++) {
        let diff = target - nums[i]
        if (obj.hasOwnProperty(diff)) {
            return [obj[diff], i]
        }

        obj[nums[i]] = i
    }
}