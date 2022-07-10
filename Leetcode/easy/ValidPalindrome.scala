// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Time O(n), Space O(n)

object Solution {
    def isPalindrome(s: String): Boolean = {
        val sFiltered = s.filter(_.isLetterOrDigit)
        sFiltered.reverse equalsIgnoreCase sFiltered
    }
}