// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

public class Solution 
{
    public IList<IList<int>> LevelOrder(TreeNode root) 
    {
        var result = new List<IList<int>>();
        
        if (root == null)
            return result;
        
        var queue = new Queue<TreeNode>();
        queue.Enqueue(root);
        
        while (queue.Count != 0)
        {
            int sizeOfQueue = queue.Count;
            var row = new List<int>();
            
            while (sizeOfQueue > 0)
            {
                var node = queue.Dequeue();
                if (node.left != null)
                    queue.Enqueue(node.left);
                if (node.right != null)
                    queue.Enqueue(node.right);
                
                row.Add(node.val);
                sizeOfQueue--;
            }
            
            result.Add(row);
        }
        
        return result;
    }
}