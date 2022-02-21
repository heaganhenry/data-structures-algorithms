# Given a binary tree, find its height.

class Solution:
    def height(self, root):
        if not root:
            return 0
        
        return 1 + max(self.height(root.left), self.height(root.right))