// Given a string s which consists of lowercase or uppercase letters, return the length of the longest (case sensitive) palindrome that can be built with those letters.
// Time O(n), Space O(n)

object Solution {
    def longestPalindrome(s: String): Int = {
        val freq = s.groupBy(identity).mapValues(_.length).toMap
        val longest = freq.foldLeft(0) { case (a, (k, v)) =>
            if (v % 2 == 0) a + v
            else a + v - 1
        }

        if (longest < s.length) longest + 1
        else longest
    }
}