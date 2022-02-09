# Given an array nums of size n, return the majority element.
# The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution(object):
    def majorityElement(self, nums):
        res, maj = 0, 0
        count = {}
        
        for n in nums:
            count[n] = count.get(n, 0) + 1
            res = n if count[n] > maj else res
            maj = max(maj, count[n])
        
        return res

# O(1) space solution

class Solution(object):
    def majorityElement(self, nums):
        res, count = 0
        
        for n in nums:
            if count == 0:
                res = n
            count += (1 if n == res else - 1)
            
        return res