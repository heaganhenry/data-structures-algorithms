// Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.
// Time O(n), Space O(1)

class RemoveElement {
    public static int remove(int[] arr, int key) {
      int slow = 0;
      for (int fast = 0; fast < arr.length; fast++){
        if (arr[fast] != key){
          arr[slow] = arr[fast];
          slow++;
        }
      }

      return slow;
    }
}