// Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target and return the indices of the two numbers.
// Time O(n), Space O(1)

class Solution
{
    public static int[] PairWithTargetSum(int[] arr, int targetSum)
    {
        int left = 0, right = arr.Length - 1;

        while (left < right)
        {
            if (arr[left] + arr[right] > targetSum)
                right--;
            else if (arr[left] + arr[right] < targetSum)
                left++;
            else
                return new int[] {left, right};
        }
        return new int[] {-1, -1};
    }
}