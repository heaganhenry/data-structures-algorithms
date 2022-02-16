# Given the root of a binary tree, return its maximum depth.
# A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

class Solution(object):
    def maxDepth(self, root):
        if not root:
            return 0
        
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))

# Iterative Pre order DFS
class Solution:
    def maxDepth(self, root):
        res = 0
        stack = [[root, 1]]
        
        while stack:
            node, depth = stack.pop()
            if node:
                res = max(res, depth)
                stack.append([node.left, depth + 1])
                stack.append([node.right, depth + 1])
        
        return res

# Iterative Level order BFS
class Solution:
    def maxDepth(self, root):
        if not root:
            return 0
        
        depth = 0
        queue = collections.deque([root])
        
        while queue:
            for i in range(len(queue)):
                node = queue.popleft()
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            depth += 1
        return depth