# Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target and return the indices of the two numbers.
# Time O(n), Space O(1)

def pair_with_targetsum(arr, target_sum):
  left, right = 0, len(arr) - 1

  while left < right:
    if arr[left] + arr[right] > target_sum:
      right -= 1
    elif arr[left] + arr[right] < target_sum:
      left += 1
    else:
      return [left, right]
  
  return [-1, -1]