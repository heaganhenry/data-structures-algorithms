// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

public class Solution 
{
    public bool HasPathSum(TreeNode root, int targetSum) 
    {
        return DFS(root, 0, targetSum);
    }
    
    public static bool DFS(TreeNode node, int curSum, int targetSum)
    {
        if (node == null)
            return false;
        
        curSum += node.val;
        if (node.left == null && node.right == null)
            return curSum == targetSum;
        
        return DFS(node.left, curSum, targetSum) || DFS(node.right, curSum, targetSum);
    }
}