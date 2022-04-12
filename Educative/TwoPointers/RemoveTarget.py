# Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.
# Time O(n), Space O(1)

def remove_element(arr, key):
  slow = 0
  for fast in range(len(arr)):
    if (arr[fast] != key):
      arr[slow] = arr[fast]
      slow += 1

  return slow