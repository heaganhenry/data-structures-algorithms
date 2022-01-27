// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

public class Solution 
{
    public int MaxSubArray(int[] nums) 
    {
        var curSum = 0;
        var maxSub = nums[0];
        
        foreach (var num in nums)
        {
            if (curSum < 0)
                curSum = 0;
            curSum += num;
            maxSub = Math.Max(curSum, maxSub);
        }
        
        return maxSub;
    }
}