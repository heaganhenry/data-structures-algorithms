# Given a binary tree, determine if it is height-balanced.
# A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

class Solution(object):
    def isBalanced(self, root):
        def dfs(root):
            if not root:
                return [True, 0]
            
            left, right = dfs(root.left), dfs(root.right)
            balanced = ((left[0] and right[0]) and 
                        abs(left[1] - right[1]) <= 1)
            return [balanced, 1 + max(left[1], right[1])]
        
        return dfs(root)[0]