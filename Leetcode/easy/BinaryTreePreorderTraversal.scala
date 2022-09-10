// Given the root of a binary tree, return the preorder traversal of its nodes' values.
// Time O(n), Space O(n)

object Solution {
    def preorderTraversal(root: TreeNode): List[Int] = {
        if (root == null) List()
        else List(root.value) ::: preorderTraversal(root.left) ::: preorderTraversal(root.right)
    }
}