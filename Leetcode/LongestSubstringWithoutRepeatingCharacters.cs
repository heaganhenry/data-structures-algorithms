// Given a string s, find the length of the longest substring without repeating characters.
// Time O(n), Space O(n)

public class Solution 
{
    public int LengthOfLongestSubstring(string s) 
    {
        int window_start = 0, max_length = 0;
        var uniques = new System.Collections.Generic.HashSet<char>();
        
        for (int window_end = 0; window_end < s.Length; window_end++)
        {
            var right_char = s[window_end];
            while (uniques.Contains(right_char))
            {
                var left_char = s[window_start];
                uniques.Remove(left_char);
                window_start++;
            }
            
            uniques.Add(right_char);
            max_length = System.Math.Max(max_length, window_end - window_start + 1);
        }
        
        return max_length;
    }
}