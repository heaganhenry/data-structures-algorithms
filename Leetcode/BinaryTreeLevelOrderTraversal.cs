// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

public class Solution 
{
    public IList<IList<int>> LevelOrder(TreeNode root) 
    {
        var result = new List<IList<int>>();
        var queue = new Queue<TreeNode>();
        queue.Enqueue(root);
        
        while (queue.Count != 0)
        {
            int sizeOfQueue = queue.Count;
            var level = new List<int>();
            
            for (int i = 0; i < sizeOfQueue; i++)
            {
                var node = queue.Dequeue();
                if (node != null)
                {
                    level.Add(node.val);
                    queue.Enqueue(node.left);
                    queue.Enqueue(node.right);
                }                
            }
            if (level.Count != 0)
                result.Add(level);
        }
        
        return result;
    }
}