// Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times.
// Time O(n), Space O(n)

const majorityElement = function(nums) {
    let count = {}

    for (let n of nums) {
        count[n] ? count[n]++ : count[n] = 1
        if (count[n] > nums.length / 2) return n
    }
}