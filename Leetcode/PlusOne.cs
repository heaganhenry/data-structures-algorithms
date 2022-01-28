// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
// Increment the large integer by one and return the resulting array of digits.

public class Solution 
{
    public int[] PlusOne(int[] digits) 
    {
        int i = digits.Length - 1;
        
        while (i >= 0)
        {
            if (digits[i] == 9)
                digits[i] = 0;
            else
            {
                digits[i]++;
                return digits;
            }
            i--;
        }
        
        var result = new int[digits.Length + 1];
        result[0] = 1;
        return result;
    }
}