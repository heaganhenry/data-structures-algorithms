# Given a string, find the length of the longest substring, which has all distinct characters.
# Time O(n), Space O(k) where k is the number of distinct characters in the string

def non_repeat_substring(str1):
  window_start, max_length = 0, 0
  index_map = {}

  for window_end in range(len(str1)):
    right_char = str1[window_end]
    if right_char in index_map:
      window_start = max(window_start, index_map[right_char] + 1)
    
    index_map[right_char] = window_end
    max_length = max(max_length, window_end - window_start + 1)
  return max_length