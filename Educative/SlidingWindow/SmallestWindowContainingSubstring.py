# Given a string and a pattern, find the smallest substring in the given string which has all the character occurrences of the given pattern.
# Time O(n), Space O(m) where m is the length of the pattern

def find_substring(str1, pattern):
  window_start, matches = 0, 0
  substr_start, min_length = 0, len(str1) + 1
  char_freq = {}

  for char in pattern:
    char_freq[char] = char_freq.get(char, 0) + 1

  for window_end in range(len(str1)):
    right_char = str1[window_end]
    if right_char in char_freq:
      char_freq[right_char] -= 1
      if char_freq[right_char] == 0:
        matches += 1
    
    while matches == len(char_freq):
      if min_length > window_end - window_start + 1:
        min_length = window_end - window_start + 1
        substr_start = window_start
    
      left_char = str1[window_start]
      if left_char in char_freq:
        if char_freq[left_char] == 0:
          matches -= 1
        char_freq[left_char] += 1
      window_start += 1
  
  if min_length > len(str1):
    return ""
  return str1[substr_start:substr_start + min_length]