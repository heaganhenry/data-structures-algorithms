// Given an array of sorted numbers, remove all duplicates from it in-place and return the length of the subarray without duplicates. You should not use any extra space.
// Time O(n), Space O(1)

class RemoveDuplicates {
    public static int remove(int[] arr) {
      int left = 1;
  
      for (int right = 1; right < arr.length; right++){
        if (arr[right] != arr[right - 1]){
          arr[left] = arr[right];
          left++;
        }
      }

      return left;
    }
}