# You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
# Increment the large integer by one and return the resulting array of digits.
class Solution(object):
    def plusOne(self, digits):
        i = len(digits) - 1
        
        while i >= 0:
            if digits[i] == 9:
                digits[i] = 0
            else:
                digits[i] += 1
                return digits
            i -= 1
        
        return [1] + digits