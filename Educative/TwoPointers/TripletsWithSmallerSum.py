# Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices.
# Write a function to return the count of such triplets.
# Time O(n^2), Space O(n) for sorting

def triplet_with_smaller_sum(arr, target):
  arr.sort()
  count = 0

  for i in range(len(arr) - 2):
    left, right = i + 1, len(arr) - 1
    while left < right:
      triplet = arr[i] + arr[left] + arr[right]
      if triplet < target:
        count += right - left
        left += 1
      else:
        right -= 1

  return count