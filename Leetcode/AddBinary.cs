// Given two binary strings a and b, return their sum as a binary string.

public class Solution 
{
    public string AddBinary(string a, string b) 
    {
        var binary = new StringBuilder();
        int carry = 0;
        int i = a.Length - 1, j = b.Length - 1;
        
        while (i >= 0 || j >= 0)
        {
            int sum = carry;
            sum += i >= 0 ? a[i] - '0' : 0;
            sum += j >= 0 ? b[j] - '0' : 0;
            binary.Insert(0, (sum % 2).ToString());
            carry = sum / 2;
            
            i--;
            j--;
        }
        
        if (carry != 0) binary.Insert(0, carry.ToString());
        return binary.ToString();
    }
}