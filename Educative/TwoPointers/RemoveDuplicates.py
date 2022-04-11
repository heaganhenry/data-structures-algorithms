# Given an array of sorted numbers, remove all duplicates from it in-place and return the length of the subarray without duplicates. You should not use any extra space.
# Time O(n), Space O(1)

def remove_duplicates(arr):
  left = 1

  for right in range(1, len(arr)):
    if arr[right] != arr[right - 1]:
      arr[left] = arr[right]
      left += 1
  
  return left 