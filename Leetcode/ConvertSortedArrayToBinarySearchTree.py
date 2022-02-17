# Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
# A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

class Solution(object):
    def sortedArrayToBST(self, nums):
        def createBST(left, right):
            if left > right:
                return None
            
            mid = (left + right) // 2
            root = TreeNode(nums[mid])
            root.left = createBST(left, mid - 1)
            root.right = createBST(mid + 1, right)
            return root
    
        return createBST(0, len(nums) - 1)