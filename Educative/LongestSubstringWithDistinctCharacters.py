# Given a string, find the length of the longest substring, which has all distinct characters.
# Time O(n), Space O(n)

def non_repeat_substring(str1):
  window_start = 0
  max_length = 0
  uniques = set()

  for window_end in range(len(str1)):
    right_char = str1[window_end]      
    while right_char in uniques:
      left_char = str1[window_start]
      uniques.remove(left_char)
      window_start += 1

    uniques.add(right_char)
    max_length = max(max_length, window_end - window_start + 1)
  return max_length