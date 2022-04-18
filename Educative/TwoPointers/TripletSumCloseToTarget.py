# Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, return the sum of the triplet.
# If there are more than one such triplet, return the sum of the triplet with the smallest sum.
# Time O(n^2), Space O(n)

def triplet_sum_close_to_target(arr, target_sum):
  arr.sort()
  closest = arr[0] + arr[1] + arr[2]

  for i in range(len(arr) - 2):
    left, right = i + 1, len(arr) - 1
    while left < right:
      three_sum = arr[i] + arr[left] + arr[right]
      if three_sum == target_sum:
        return three_sum

      if abs(three_sum - target_sum) < abs(closest - target_sum):
        closest = three_sum

      if three_sum < target_sum:
        left += 1
      elif three_sum > target_sum:
        right -= 1

  return closest