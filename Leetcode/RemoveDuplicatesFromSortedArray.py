# Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
# The relative order of the elements should be kept the same.
# Return the number of unique elements, k, after placing the final result in the first k slots of nums.

def removeDuplicates(self, nums):
    left = 1
        
    for right in range(1, len(nums)):
        if nums[right] != nums[right - 1]:
            nums[left] = nums[right]
            left += 1
        
    return left