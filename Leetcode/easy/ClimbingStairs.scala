// You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// Time O(n), Space O(1)

object Solution {
    def climbStairs(n: Int, a: Int = 0, b: Int = 1): Int = {
	    if (n == 0) b
	    else climbStairs(n - 1, b, a + b)
    }
}