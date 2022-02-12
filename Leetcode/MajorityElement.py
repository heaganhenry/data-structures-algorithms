# Given an array nums of size n, return the majority element.
# The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution(object):
    def majorityElement(self, nums):
        res, count = 0, 0
        freq = {}
        
        for n in nums:
            freq[n] = freq.get(n, 0) + 1
            res = n if freq[n] > count else res
            count = max(count, freq[n])
        
        return res

# O(1) space solution

class Solution(object):
    def majorityElement(self, nums):
        res, count = 0, 0
        
        for n in nums:
            if count == 0:
                res = n
            count += (1 if n == res else - 1)
            
        return res