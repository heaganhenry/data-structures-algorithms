# Given two binary strings a and b, return their sum as a binary string.

class Solution(object):
    def addBinary(self, a, b):
        binary, carry = "", 0
        i, j = len(a) - 1, len(b) - 1
        
        while (i >= 0 or j >= 0):
            sum = carry
            sum += int(a[i]) if i >= 0 else 0
            sum += int(b[j]) if j >= 0 else 0
            binary += str(sum % 2)
            carry = sum // 2
            
            i -= 1
            j -= 1
        
        if carry != 0:
            binary += str(carry)
        return binary[::-1]