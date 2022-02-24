# Given the root of a binary tree, return the inorder traversal of its nodes' values.

class Solution(object):
    def inorderTraversal(self, root):
        if root is None:
            return []
        
        return (self.inorderTraversal(root.left) + [root.val]
    + self.inorderTraversal(root.right))