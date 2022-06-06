// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if: Open brackets must be closed by the same type of brackets. + Open brackets must be closed in the correct order.
// Time O(n), Space O(n)

object Solution {
    def isValid(s: String): Boolean = {
        val map = Map(')' -> '(', '}' -> '{', ']' -> '[')
        var stack = scala.collection.mutable.Stack[Char]()

        for (c <- s) {
            if (map.contains(c) && !stack.isEmpty && stack.top == map(c)) {
                stack.pop
            } else {
                stack.push(c)
            }
        }

        stack.isEmpty
    }
}