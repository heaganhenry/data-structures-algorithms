# Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
# If there is no such substring, return the empty string "".
# Time O(m), Space O(n)

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        window_start, matches = 0, 0
        substr_start, min_length = 0, len(s) + 1
        char_freq = {}

        for char in t:
            char_freq[char] = char_freq.get(char, 0) + 1

        for window_end in range(len(s)):
            right_char = s[window_end]
            if right_char in char_freq:
                char_freq[right_char] -= 1
                if char_freq[right_char] == 0:
                    matches += 1

            while matches == len(char_freq):
                if min_length > window_end - window_start + 1:
                    min_length = window_end - window_start + 1
                    substr_start = window_start

                left_char = s[window_start]
                if left_char in char_freq:
                    if char_freq[left_char] == 0:
                        matches -= 1
                    char_freq[left_char] += 1
                window_start += 1

        if min_length > len(s):
            return ""
        return s[substr_start:substr_start + min_length]