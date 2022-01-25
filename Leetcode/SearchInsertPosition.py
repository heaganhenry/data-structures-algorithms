# Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
# You must write an algorithm with O(log n) runtime complexity.

def searchInsert(self, nums, target):
    left = 0
    right = len(nums) - 1

    while left <= right:
        middle = (left + right) // 2
        if nums[middle] == target:
            return middle
        
        if nums[middle] > target:
            right = middle - 1
        else:
            left = middle + 1
    
    return left