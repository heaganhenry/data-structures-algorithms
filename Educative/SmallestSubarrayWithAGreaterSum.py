# Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
# Time O(n), Space O(1)

import math

def smallest_subarray_sum(s, arr):
    window_start, window_sum = 0, 0
    min_length = math.inf

    for window_end in range(len(arr)):
        window_sum += arr[window_end]
        while window_sum >= s:
            min_length = min(min_length, window_end - window_start + 1)
            window_sum -= arr[window_start]
            window_start += 1
            
    if min_length == math.inf:
        return 0
    return min_length