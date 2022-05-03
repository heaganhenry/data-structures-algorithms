# Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.
# Time O(n), Space O(1)

def dutch_flag_sort(arr):
  i = 0
  left, right = 0, len(arr) - 1

  while (i <= right):
    if arr[i] == 0:
      arr[i], arr[left] = arr[left], arr[i]
      i += 1
      left += 1
    elif arr[i] == 1:
      i += 1
    else:
      arr[i], arr[right] = arr[right], arr[i]
      right -= 1