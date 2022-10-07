# Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements (in-place).
# Time O(n), Space O(1)

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        slow = 0
        for fast in range(len(nums)):
            if nums[fast] != 0:
                nums[fast], nums[slow] = nums[slow], nums[fast]
                slow += 1