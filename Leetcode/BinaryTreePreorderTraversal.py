# Given the root of a binary tree, return the preorder traversal of its nodes' values.

class Solution(object):
    def preorderTraversal(self, root):
        if not root:
            return []
        
        return [root.val] + self.preorderTraversal(root.left) + self.preorderTraversal(root.right)