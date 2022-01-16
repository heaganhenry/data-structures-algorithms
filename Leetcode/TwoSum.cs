// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.Length; i++)
            for (int j = 0; j < nums.Length; j++)
                if (i != j)
                    if (nums[i] + nums[j] == target)
                        return new int[] {i, j};
        return new int[] {0, 1};
    }
}