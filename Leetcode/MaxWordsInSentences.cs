// A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
// You are given an array of strings sentences, where each sentences[i] represents a single sentence.
// Return the maximum number of words that appear in a single sentence.

public class Solution 
{
    public int MostWordsFound(string[] sentences) 
    {
        int result = 0;
        foreach (string s in sentences)
            result = Math.Max(result, s.Split(' ').Length);
        
        return result;
    }
}