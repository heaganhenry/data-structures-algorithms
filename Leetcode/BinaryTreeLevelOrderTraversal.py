# Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

class Solution(object):
    def levelOrder(self, root):
        result = []
        queue = collections.deque()
        queue.append(root)
        
        while queue:
            level = []
            size = len(queue)
            
            for i in range(size):
                node = queue.popleft()
                if node:
                    level.append(node.val)
                    queue.append(node.left)
                    queue.append(node.right)
            if level:
                result.append(level)
                
        return result