// Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
// Time O(n), Space O(1)

class MinSizeSubArraySum {
  public static int findMinSubArray(int s, int[] arr) {
    int windowStart = 0, windowSum = 0;
    int minLength = arr.length + 1;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++){
      windowSum += arr[windowEnd];
      while (windowSum >= s){
        minLength = Math.min(minLength, windowEnd - windowStart + 1);
        windowSum -= arr[windowStart];
        windowStart++;
      }
    }

    if (minLength > arr.length)
      return 0;
    return minLength;
  }
}