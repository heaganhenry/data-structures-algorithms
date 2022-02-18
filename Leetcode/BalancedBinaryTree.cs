// Given a binary tree, determine if it is height-balanced.
// A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

public class Solution 
{
    public bool IsBalanced(TreeNode root) 
    {
        static (bool bal, int height) DFS(TreeNode root)
        {
            if (root == null)
                return (true, 0);
            
            var left = DFS(root.left);
            var right = DFS(root.right);
            bool balanced = (left.bal && right.bal) && 
                Math.Abs(left.height - right.height) <= 1;
            return (balanced, 1 + Math.Max(left.height, right.height));
        }
        
        return DFS(root).bal;
    }
}