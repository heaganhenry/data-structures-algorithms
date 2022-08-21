// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Time O(n), Space O(n)

object Solution {
    def backspaceCompare(s: String, t: String): Boolean = {
        def buildString(s: String, acc: String): String = {
            if (s.isEmpty) acc.reverse
            else if (s.head == '#') buildString(s.tail, acc.tail)
            else buildString(s.tail, s.head + acc)
        }

        buildString(s, "") == buildString(t, "")
    }
}