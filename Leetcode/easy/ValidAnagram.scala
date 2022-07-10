// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Time O(n), Space O(n)

object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        def charMap(string: String) = string.groupBy(identity).view.mapValues(_.length).toMap
        charMap(s) == charMap(t)
    }
}