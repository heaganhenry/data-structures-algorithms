// Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

public class Solution 
{
    public int LengthOfLastWord(string s) 
    {
        int i = s.Length - 1, length = 0;
        
        while (s[i] == ' ')
            i--;
        while (i >= 0 && s[i] != ' ')
        {
            length++;
            i--;
        }
        
        return length;
    }
}