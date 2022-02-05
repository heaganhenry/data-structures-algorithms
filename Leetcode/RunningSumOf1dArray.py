# Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
# Return the running sum of nums.

class Solution(object):
    def runningSum(self, nums):
        result = [nums[0]]
        
        for i in range(1, len(nums)):
            result.append(result[-1] + nums[i])
            
        return result