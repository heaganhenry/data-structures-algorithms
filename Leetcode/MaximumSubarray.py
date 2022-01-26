# Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

def maxSubArray(self, nums):
    cur_sum = 0
    max_sub = nums[0]
        
    for num in nums:
        if cur_sum < 0:
            cur_sum = 0
        cur_sum += num
        max_sub = max(cur_sum, max_sub)
        
    return max_sub