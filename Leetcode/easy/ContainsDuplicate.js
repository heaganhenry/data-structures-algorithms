// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Time O(n), Space O(n)

const containsDuplicate = function(nums) {
    const counts = {}

    for (let n of nums) {
        counts[n] = counts[n] + 1 || 1
        if (counts[n] > 1) return true
    }

    return false
}