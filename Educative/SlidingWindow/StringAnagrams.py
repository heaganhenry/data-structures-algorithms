# Given a string and a pattern, find all anagrams of the pattern in the given string and return a list of starting indices of the anagrams in the given string.
# Time O(n), Space O(n)

def find_string_anagrams(str1, pattern):
  window_start, matches = 0, 0
  char_freq, indexes = {}, []

  for char in pattern:
    char_freq[char] = char_freq.get(char, 0) + 1

  for window_end in range(len(str1)):
    right_char = str1[window_end]
    if right_char in char_freq:
      char_freq[right_char] -= 1
      if char_freq[right_char] == 0:
        matches += 1

    if matches == len(char_freq):
      indexes.append(window_start)

    if window_end >= len(pattern) - 1:
      left_char = str1[window_start]
      if left_char in char_freq:
        if char_freq[left_char] == 0:
          matches -= 1
        char_freq[left_char] += 1
      window_start += 1

  return indexes