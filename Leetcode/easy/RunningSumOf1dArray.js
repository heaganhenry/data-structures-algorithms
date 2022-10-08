// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.
// Time O(n), Space O(n)

const runningSum = function(nums) {
    let result = [nums[0]]
    for (let i = 1; i < nums.length; i++) {
        result.push(result[i - 1] + nums[i])
    }

    return result
}