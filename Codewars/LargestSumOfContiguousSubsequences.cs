// Given an array of numbers, calculate the largest sum of all possible blocks of consecutive elements within the array. 
// The numbers will be a mix of positive and negative values. If all numbers of the sequence are nonnegative, the answer will be the sum of the entire array.
// If all numbers in the array are negative, your algorithm should return zero. Similarly, an empty array should result in a zero return from your algorithm.
// Time O(n), Space O(1)

public static class Kata
{
  public static int LargestSum(int[] arr)
  {
    int sum = 0, maxSum = 0;
    
    for (int i = 0; i < arr.Length; i++)
    {
      sum += arr[i];
      if (sum < 0)
        sum = 0;
      
      if (sum > maxSum)
        maxSum = sum;
    }
    
    return maxSum;
  }
}