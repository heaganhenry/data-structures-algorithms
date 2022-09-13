// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise. Each letter can only be used once.
// Time O(n), Space O(n)

object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        ransomNote.intersect(magazine) == ransomNote
    }
}