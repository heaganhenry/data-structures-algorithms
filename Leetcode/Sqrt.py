# Given a non-negative integer x, compute and return the square root of x.
# Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

class Solution(object):
    def mySqrt(self, x):
        if x < 2:
            return x
        
        left = 2
        right = x // 2
        
        while left <= right:
            mid = (left + right) // 2
            if mid * mid == x:
                return mid
            elif mid * mid > x:
                right = mid - 1
            elif mid * mid < x:
                left = mid + 1
        
        return left - 1