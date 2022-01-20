# Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
# An input string is valid if: Open brackets must be closed by the same type of brackets. + Open brackets must be closed in the correct order.

class Solution(object):
    def isValid(self, s):
        stack = []
        bracket_map = { ")" : "(" , "]" : "[", "}" : "{"}
        
        for bracket in s:
            if bracket in bracket_map:
                if stack and stack[-1] == bracket_map[bracket]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(bracket)
        
        return len(stack) == 0