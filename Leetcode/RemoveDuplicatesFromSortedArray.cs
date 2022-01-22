// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
// Return the number of unique elements, k, after placing the final result in the first k slots of nums.

public class Solution 
{
    public int RemoveDuplicates(int[] nums) 
    {
        if (nums.Length <= 1)
            return nums.Length;

        var left = 1;
        
        for (int right = 1; right < nums.Length; right++)
        {
            if (nums[right] != nums[right - 1])
            {
                nums[left] = nums[right];
                left++;
            }
        }
        
        return left;
    }
}