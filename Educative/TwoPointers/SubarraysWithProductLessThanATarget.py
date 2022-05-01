# Given an array with positive numbers and a positive target number, find all of its contiguous subarrays whose product is less than the target number.
# Time O(n^3), Space O(n^3)

from collections import deque

def find_subarrays(arr, target):
  result = []
  product = 1
  left = 0

  for right in range(len(arr)):
    product *= arr[right]
    while product >= target and left < len(arr):
      product /= arr[left]
      left += 1

    temp_list = deque()
    for i in range(right, left - 1, -1):
      temp_list.appendleft(arr[i])
      result.append(list(temp_list))

  return result