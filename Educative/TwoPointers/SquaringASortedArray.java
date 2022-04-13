// Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.
// Time O(n), Space O(n)

class SortedArraySquares {
  public static int[] makeSquares(int[] arr) {
    int n = arr.length;
    int[] squares = new int[n];
    int curSquareIdx = n - 1;
    int left = 0, right = n - 1;

    while (left <= right) {
      int leftSquare = arr[left] * arr[left];
      int rightSquare = arr[right] * arr[right];
      if (leftSquare > rightSquare) {
        squares[curSquareIdx--] = leftSquare;
        left++;
      } else {
        squares[curSquareIdx--] = rightSquare;
        right--;
      }
    }

    return squares;
  }
}