# Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
# Time O(n^2), Space O(n)

def search_triplets(arr):
  arr.sort()
  triplets = []
  for i in range(len(arr)):
    if i > 0 and arr[i] == arr[i - 1]:
      continue
    search_pair(arr, -arr[i], i + 1, triplets)

  return triplets

def search_pair(arr, target_sum, left, triplets):
  right = len(arr) - 1
  while left < right:
    current_sum = arr[left] + arr[right]
    if current_sum == target_sum: # additional condition?
      triplets.append([-target_sum, arr[left], arr[right]])
      left += 1
      right -= 1
      while left < right and arr[left] == arr[left - 1]: # additional condition?
        left += 1
      while left < right and arr[right] == arr[right + 1]:
        right -= 1
    elif current_sum < target_sum:
      left += 1
    else:
      right -= 1