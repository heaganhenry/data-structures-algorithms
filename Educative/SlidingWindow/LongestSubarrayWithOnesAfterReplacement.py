# Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.
# Time O(n), Space O(1)

def length_of_longest_substring(arr, k):
  window_start, max_length, max_ones = 0, 0, 0

  for window_end in range(len(arr)):
    if arr[window_end] == 1:
      max_ones += 1

    if (window_end - window_start + 1) - max_ones > k:
      if arr[window_start] == 1:
        max_ones -= 1
      window_start += 1
    
    max_length = max(max_length, window_end - window_start + 1)
  return max_length