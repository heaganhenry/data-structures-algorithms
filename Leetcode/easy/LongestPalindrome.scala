// Given a string s which consists of lowercase or uppercase letters, return the length of the longest (case sensitive) palindrome that can be built with those letters.
// Time O(n), Space O(n)

object Solution {
    def longestPalindrome(s: String): Int = {
        val charCount = s.groupBy(identity).mapValues(_.length).toMap
        charCount.foldLeft(0) { case (acc, (char, count)) => {
            val result = acc + (count / 2) * 2
            if (result % 2 == 0 && count % 2 == 1) result + 1 else result
        }}
    }
}