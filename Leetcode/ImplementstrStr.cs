// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class Solution 
{
    public int StrStr(string haystack, string needle) 
    {
        if (needle.Length == 0)
            return 0;
        else if (haystack.Length < needle.Length)
            return -1;
        
        for (int i = 0; i < haystack.Length - needle.Length + 1; i++)
            for (int j = 0; j < needle.Length; j++)
            {
                if (haystack[j + i] != needle[j])
                    break;
                if (j == needle.Length - 1)
                    return i;
            }
        
        return -1;
    }
}