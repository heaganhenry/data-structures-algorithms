# Given a string with lowercase letters only, if you are allowed to replace no more than k letters with any letter, find the length of the longest substring having the same letters after replacement.
# Time O(n), Space O(n)

def length_of_longest_substring(str1, k):
  window_start, max_window, max_freq = 0, 0, 0
  char_freq = {}

  for window_end in range(len(str1)):
    right_char = str1[window_end]
    char_freq[right_char] = char_freq.get(right_char, 0) + 1
    max_freq = max(max_freq, char_freq[right_char])

    if (window_end - window_start + 1) - max_freq > k:
      left_char = str1[window_start]
      char_freq[left_char] -= 1
      window_start += 1
    
    max_window = max(max_window, window_end - window_start + 1)
  return max_window