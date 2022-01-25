# Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

def strStr(self, haystack, needle):
    if len(needle) == 0:
        return 0
        
    for i in range(len(haystack) - len(needle) + 1):
        if haystack[i:i + len(needle)] == needle:
            return i
            
    return -1

# The following solution is valid but won't be accepted by Leetcode

def strStr(self, haystack, needle):
    if len(needle) == 0:
        return 0
    elif len(haystack) < len(needle):
        return -1
        
    for i in range(len(haystack) - len(needle) + 1):
        if haystack[i] == needle[0]:
            for j in range(len(needle)):
                if haystack[j + i] != needle[j]:
                    break
                if j == len(needle) - 1:
                    return i
    return -1