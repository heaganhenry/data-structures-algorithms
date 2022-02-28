# A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
# Given a string s, return true if it is a palindrome, or false otherwise.

class Solution(object):
    def isPalindrome(self, s):
        left = 0
        right = len(s) - 1
        
        while left <= right:
            while not s[left].isalnum() and left < right:
                left += 1
            while not s[right].isalnum() and left < right:
                right -= 1
            
            if s[left] == s[right] or s[left].upper() == s[right].upper():
                left, right = left + 1, right - 1
            else:
                return False
        return True