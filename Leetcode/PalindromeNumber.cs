// Given an integer x, return true if x is palindrome integer.

public class Solution 
{
    public bool IsPalindrome(int x) 
    {
        var numStr = x.ToString();
        var revStr = "";
        
        for (int i = numStr.Length - 1; i >= 0; i--)
            revStr += numStr[i];
        if (revStr == numStr)
            return true;

        return false;
    }
}