# Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.
# Time O(n), Space O(n)

def make_squares(arr):
  n = len(arr)
  cur_square_idx = n - 1
  squares = [0 for x in range(n)]
  left, right = 0, n - 1

  while left <= right:
    left_square = arr[left] ** 2
    right_square = arr[right] ** 2
    if left_square > right_square:
      squares[cur_square_idx] = left_square
      left += 1
    else:
      squares[cur_square_idx] = right_square
      right -= 1
    cur_square_idx -= 1

  return squares