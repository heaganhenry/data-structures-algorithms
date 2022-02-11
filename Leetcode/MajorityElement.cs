// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

public class Solution 
{
    public int MajorityElement(int[] nums) 
    {
        var freq = new Dictionary<int, int>();
        
        foreach (var num in nums)
        {
            if (freq.ContainsKey(num))
                freq[num]++;
            else
                freq[num] = 1;
            
            if (freq[num] > nums.Length / 2)
                return num;
        }
        
        return -1;
    }
}