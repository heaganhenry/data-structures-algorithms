// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class Solution 
{
    public int ClimbStairs(int n) 
    {
        int one = 1, two = 1;
        
        for (int i = 0; i < n - 1; i++)
        {
            int temp = one;
            one = one + two;
            two = temp;
        }
        
        return one;
    }
}