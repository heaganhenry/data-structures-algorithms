// Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, return the sum of the triplet.
// If there are more than one such triplet, return the sum of the triplet with the smallest sum.
// Time O(n^2), Space O(n)

import java.util.*;

class TripletSumCloseToTarget {
  public static int searchTriplet(int[] arr, int targetSum) {
    Arrays.sort(arr);
    int closestSum = arr[0] + arr[1] + arr[2];

    for (int i = 0; i < arr.length - 2; i++) {
      int left = i + 1, right = arr.length - 1;
      while (left < right) {
        int threeSum = arr[i] + arr[left] + arr[right];
        if (threeSum == targetSum)
          return threeSum;

        if (Math.abs(threeSum - targetSum) < Math.abs(closestSum - targetSum))
          closestSum = threeSum;

        if (threeSum < targetSum)
          left++;
        else if (threeSum > targetSum)
          right--;
      }
    }

    return closestSum;
  }
}