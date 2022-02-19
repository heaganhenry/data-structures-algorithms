# Given a binary tree, find its minimum depth.
# The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
class Solution(object):
    def minDepth(self, root):
        if not root:
            return 0
        
        min_left = self.minDepth(root.left)
        min_right = self.minDepth(root.right)
        if min_left == 0 or min_right == 0:
            return 1 + max(min_left, min_right)
        return 1 + min(min_left, min_right)

# BFS
class Solution:
    def minDepth(self, root):
        if not root:
            return 0
        
        depth = 0
        queue = collections.deque([root])
        
        while queue:
            level = len(queue)
            for i in range(level):
                node = queue.popleft()
                if not node.left and not node.right:
                    depth += 1
                    return depth
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            depth += 1
        
        return depth