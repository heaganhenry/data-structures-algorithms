# Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

def lengthOfLastWord(self, s):
    i, length = len(s) - 1, 0
    
    while s[i] == ' ':
        i -= 1
    while s[i] != ' ' and i >= 0:
        length += 1
        i -= 1
    
    return length