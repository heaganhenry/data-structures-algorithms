# Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
# Return k after placing the final result in the first k slots of nums.

class Solution(object):
    def removeElement(self, nums, val):
        if len(nums) == 0:
            return 0

        k = 0

        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1

        return k