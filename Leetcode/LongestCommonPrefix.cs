// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

public class Solution
{
    public string LongestCommonPrefix(string[] strs)
    {
        if (strs.Length == 0)
            return "";
        if (strs.Length == 1)
            return strs[0];

        var prefix = strs[0];
        var pLength = prefix.Length;

        for (int i = 1; i < strs.Length; i++)
            while (strs[i].IndexOf(prefix) != 0)
            {
                prefix = prefix.Substring(0, pLength - 1);
                pLength--;
                if (pLength == 0)
                    return "";
            }

        return prefix;
    }
}