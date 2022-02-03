// Given the root of a binary tree, return the inorder traversal of its nodes' values.

public class Solution 
{
    public IList<int> InorderTraversal(TreeNode root) 
    {
        var output = new List<int>();
        var stack = new Stack<TreeNode>();
        var cur = root;
        
        while (cur != null || stack.Count != 0)
        {
            while (cur != null)
            {
                stack.Push(cur);
                cur = cur.left;
            }
            
            cur = stack.Pop();
            output.Add(cur.val);
            cur = cur.right;
        }
        
        return output;
    }
}