// Given an array arr of unsorted numbers and a target sum, find all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices.
// Write a function to return a list of all such triplets.
// Time O(n^3), Space O(n) for sorting

import java.util.*;

class TripletWithSmallerSum {
  public static List<List<Integer>> searchTriplets(int[] arr, int target) {
      Arrays.sort(arr);
      List<List<Integer>> triplets = new ArrayList<>();

      for (int i = 0; i < arr.length - 2; i++) {
          int left = i + 1, right = arr.length - 1;
          while (left < right) {
              if (arr[i] + arr[left] + arr[right] < target) {
                for (int j = right; j > left; j--)
                    triplets.add(Arrays.asList(arr[i], arr[left], arr[j]));
                left++;
              } else {
                  right--;
              }
          }
      }

      return triplets;
  }
}