// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise. Each letter can only be used once.
// Time O(n), Space O(n)

object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        def buildMap(string: String): Map[Char, Int] = string.groupBy(identity).mapValues(_.length).toMap

        val ransomMap = buildMap(ransomNote)
        val magazineMap = buildMap(magazine)

        ransomMap.forall{ case (k, v) => v <= magazineMap.getOrElse(k, 0) }
    }
}