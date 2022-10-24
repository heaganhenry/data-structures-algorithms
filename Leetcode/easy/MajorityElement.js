// Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times.
// Time O(n), Space O(1)

const majorityElement = function(nums) {
    let result = 0
    let count = 0

    for (let i = 0; i < nums.length; i++) {
        result = (count === 0) ? nums[i] : result
        count += (result === nums[i]) ? 1 : -1
    }

    return result
}