# Given a string and a pattern, find out if the string contains any permutation of the pattern.
# Time O(n), Space O(n)

def find_permutation(str1, pattern):
  window_start, matched = 0, 0
  char_freq = {}

  for char in pattern:
    char_freq[char] = char_freq.get(char, 0) + 1

  for window_end in range(len(str1)):
    right_char = str1[window_end]
    if right_char in char_freq:
      char_freq[right_char] -= 1
      if char_freq[right_char] == 0:
        matched += 1
    
    if matched == len(char_freq):
      return True

    if window_end >= len(pattern) - 1:
      left_char = str1[window_start]
      window_start += 1
      if left_char in char_freq:
        if char_freq[left_char] == 0:
          matched -= 1
        char_freq[left_char] += 1
  
  return False