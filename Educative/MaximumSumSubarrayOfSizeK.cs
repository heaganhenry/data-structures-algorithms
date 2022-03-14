// Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
// Time O(n), Space O(1)

public class Solution
{
    public static int MaxSubArrayOfSizeK(int k, int[] arr)
    {
        int windowSum = 0, maxSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd <= arr.Length; windowEnd++)
        {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1)
            {
                maxSum = System.Math.Max(windowSum, maxSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}