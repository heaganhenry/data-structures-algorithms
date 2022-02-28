// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

public class Solution 
{
    public bool IsPalindrome(string s) 
    {
        int left = 0, right = s.Length - 1;
        
        while (left <= right)
        {
            while (!Char.IsLetterOrDigit(s[left]) && left < right)
                left++;
            while (!Char.IsLetterOrDigit(s[right]) && left < right)
                right--;
            
            if (s[left] == s[right] || 
                Char.ToUpper(s[left]) == Char.ToUpper(s[right]))
            {
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
}