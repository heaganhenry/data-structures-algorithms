# Given an integer x, return true if x is palindrome integer.

class Solution(object):
    def isPalindrome(self, x):
            str_num = str(x)
            str_rev = ""
            
            for i in str_num:
                str_rev = i + str_rev
            
            if str_num == str_rev:
                return True
            
            return False