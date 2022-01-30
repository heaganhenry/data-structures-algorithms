// Given a non-negative integer x, compute and return the square root of x.
// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

public class Solution 
{
    public int MySqrt(int x) 
    {
        if (x < 2)
            return x;
        
        int left = 2;
        int right = x / 2;
        
        while (left <= right)
        {
            int mid = (left + right) / 2;
            long num = (long)mid * mid;
            if (num == x)
                return mid;
            else if (num > x)
                right = mid - 1;
            else if (num < x)
                left = mid + 1;
        }
        
        return left - 1;
    }
}