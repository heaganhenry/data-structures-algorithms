# Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
# Time O(n), Space O(1)

def max_sub_array_of_size_k(k, arr):
  window_sum, max_sum = 0, 0
  window_start = 0

  for window_end in range(len(arr)):
    window_sum += arr[window_end]

    if window_end >= k - 1:
      max_sum = max(window_sum, max_sum)
      window_sum -= arr[window_start]
      window_start += 1
  return max_sum