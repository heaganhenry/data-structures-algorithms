# Given a roman numeral, convert it to an integer.

class Solution(object):
    def romanToInt(s):
        roman_map = {"I": 1, "V": 5, "X": 10,
                    "L": 50, "C": 100, "D": 500, "M": 1000}
        roman_int = 0

        for i in range(len(s)):
            if i + 1 < len(s) and roman_map[s[i]] < roman_map[s[i + 1]]:
                roman_int -= roman_map[s[i]]
            else:
                roman_int += roman_map[s[i]]

        return roman_int