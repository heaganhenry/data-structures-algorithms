# Given the root of a binary tree, return the postorder traversal of its nodes' values.

class Solution(object):
    def postorderTraversal(self, root):
        if not root:
            return []
        
        return self.postorderTraversal(root.left) + self.postorderTraversal(root.right) + [root.val]