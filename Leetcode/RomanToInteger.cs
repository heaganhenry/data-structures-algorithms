public class Solution
{
    public int RomanToInt(string s)
    {
        var romanMap = new Dictionary<char, int>() {
            { 'I', 1 }, { 'V', 5 }, { 'X', 10 }, { 'L', 50 }, { 'C', 100 }, { 'D', 500 }, { 'M', 1000 } };
        var romanInt = 0;

        for (int i = 0; i < s.Length; i++)
            if (i + 1 < s.Length && romanMap[s[i]] < romanMap[s[i + 1]])
                romanInt -= romanMap[s[i]];
            else
                romanInt += romanMap[s[i]];

        return romanInt;
    }
}