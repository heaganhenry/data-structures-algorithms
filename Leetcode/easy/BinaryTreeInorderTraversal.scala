// Given the root of a binary tree, return the inorder traversal of its nodes' values.
// Time O(n), Space O(n) for stack frames

object Solution {
    def inorderTraversal(root: TreeNode): List[Int] = {
        if (root == null) List()
        else inorderTraversal(root.left) ::: List(root.value) ::: inorderTraversal(root.right)
    }
}