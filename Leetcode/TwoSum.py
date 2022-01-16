# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

def twoSum(nums, target):
    for i, num1 in enumerate(nums):
        for j, num2 in enumerate(nums):
            if i != j and num1 + num2 == target:
                return [i, j]

list = [20, 15, 10]
print(twoSum([8, 2, 6, 4], 6))