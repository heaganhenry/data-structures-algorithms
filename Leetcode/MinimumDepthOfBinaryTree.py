# Given a binary tree, find its minimum depth.
# The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

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