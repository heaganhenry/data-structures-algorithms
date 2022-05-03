// Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.
// Time O(n), Space O(1)

class DutchFlag {
  public static void sort(int[] arr) {
    int i = 0, left = 0, right = arr.length - 1;

    while (i <= right) {
      if (arr[i] == 0) {
        swap(i, left, arr);
        i++;
        left++;
      } else if (arr[i] == 1) {
        i++;
      } else {
        swap(i, right, arr);
        right--;
      }
    }
  }

  private static void swap(int a, int b, int[] arr) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}