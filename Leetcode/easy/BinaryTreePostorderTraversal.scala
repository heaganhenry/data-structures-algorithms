// Given the root of a binary tree, return the postorder traversal of its nodes' values.
// Time O(n), Space O(n)

object Solution {
    def postorderTraversal(root: TreeNode): List[Int] = {
        if (root == null) List()
        else postorderTraversal(root.left) ::: postorderTraversal(root.right) ::: List(root.value)
    }
}