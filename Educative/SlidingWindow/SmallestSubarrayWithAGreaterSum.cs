// Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
// Time O(n), Space O(1)

class Solution
{
    public static int FindMinSubArray(int s, int[] arr)
    {
        int windowStart = 0, windowSum = 0;
        int minLength = int.MaxValue;

        for (int windowEnd = 0; windowEnd < arr.Length; windowEnd++)
        {
            windowSum += arr[windowEnd];
            while (windowSum >= s)
            {
                minLength = System.Math.Min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        
        return minLength == int.MaxValue ? 0 : minLength;
    }
}