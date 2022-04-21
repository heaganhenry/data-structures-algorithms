// Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices.
// Write a function to return the count of such triplets.
// Time O(n^2), Space O(n) for sorting

import java.util.*;

class TripletWithSmallerSum {
  public static int searchTriplets(int[] arr, int target) {
    Arrays.sort(arr);
    int count = 0;

    for (int i = 0; i < arr.length - 2; i++) {
      int left = i + 1, right = arr.length - 1;
      while (left < right) {
        if (arr[i] + arr[left] + arr[right] < target) {
          count += right - left;
          left++;
        } else
          right--;
      }
    }

    return count;
  }
}