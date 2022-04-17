# Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers.
# Time O(n^2), Space O(n)

class Solution:
    def threeSumClosest(self, nums, target):
        nums.sort()
        closest = nums[0] + nums[1] + nums[2]

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left, right = i + 1, len(nums) - 1
            while (left < right):
                three_sum = nums[i] + nums[left] + nums[right]
                if three_sum == target:
                    return three_sum

                if abs(three_sum - target) < abs(closest - target):
                    closest = three_sum

                if three_sum < target:
                    left += 1

                elif three_sum > target:
                    right -= 1

        return closest