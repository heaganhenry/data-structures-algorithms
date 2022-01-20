// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

public class Solution 
{
    public bool IsValid(string s) 
    {
        var stack = new Stack<char>();
        var left = new List<char>() { '(', '[', '{' };
        var right = new List<char>() { ')', ']', '}' };
        
        foreach (var bracket in s)
        {
            if (left.Contains(bracket))
                stack.Push(bracket);
            
            if (right.Contains((bracket)))
            {
                if (stack.Count == 0)
                    return false;
                
                var top = stack.Pop();
                if (left.IndexOf(top) != right.IndexOf(bracket))
                    return false;
            }
        }
        
        return stack.Count == 0;
    }
}