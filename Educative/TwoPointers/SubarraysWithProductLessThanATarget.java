// Given an array with positive numbers and a positive target number, find all of its contiguous subarrays whose product is less than the target number.
// Time O(n^3), Space O(n^3)

import java.util.*;

class SubarrayProductLessThanK {
  public static List<List<Integer>> findSubarrays(int[] arr, int target) {
    List<List<Integer>> subarrays = new ArrayList<>();
    float product = 1f;
    int left = 0;

    for (int right = 0; right < arr.length; right++) {
      product *= arr[right];
      while (product >= target && left < arr.length) {
        product /= arr[left];
        left++;
      }

      List<Integer> tempList = new LinkedList<>();
      for (int i = right; i >= left; i--) {
        tempList.add(0, arr[i]);
        subarrays.add(new ArrayList<>(tempList));
      }
    }

    return subarrays;
  }
}