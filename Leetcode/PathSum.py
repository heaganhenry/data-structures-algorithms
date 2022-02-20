# Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

class Solution(object):
    def hasPathSum(self, root, targetSum):
        def dfs(node, curSum):
            if not node:
                return False
            
            curSum += node.val
            if not node.left and not node.right:
                return curSum == targetSum
            
            return dfs(node.left, curSum) or dfs(node.right, curSum)
        return dfs(root, 0)