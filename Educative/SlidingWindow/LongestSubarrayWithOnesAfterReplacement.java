// Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.
// Time O(n), Space O(1)

class ReplacingOnes {
  public static int findLength(int[] arr, int k) {
    int windowStart = 0, maxLength = 0, maxOnes = 0;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++){
      if (arr[windowEnd] == 1)
        maxOnes++;

      if (windowEnd - windowStart + 1 - maxOnes > k){
        if (arr[windowStart] == 1)
          maxOnes--;
        windowStart++;
      }

      maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }
    return maxLength;
  }
}