// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

public class Solution 
{
    public int[] RunningSum(int[] nums) 
    {
        var output = new int[nums.Length];
        output[0] = nums[0];
        
        for (int i = 1; i < nums.Length; i++)
            output[i] = output[i - 1] + nums[i];
        
        return output;
    }
}