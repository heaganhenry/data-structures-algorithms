// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if: Open brackets must be closed by the same type of brackets. + Open brackets must be closed in the correct order.
// Time O(n), Space O(n)

object Solution {
    def isValid(s: String): Boolean = {
        val map = Map(')' -> '(', ']' -> '[', '}' -> '{')

        @annotation.tailrec
        def isValidRec(stack: List[Char], curIndex: Int): Boolean = {
            if (curIndex == s.length) stack.isEmpty
            else if (stack.isEmpty && map.contains(s.charAt(curIndex))) false
            else if (!stack.isEmpty && map.contains(s.charAt(curIndex)) && stack.head == map(s.charAt(curIndex))) isValid(stack.tail, curIndex + 1)
            else isValid(s.charAt(curIndex) :: stack, curIndex + 1)
        }

        isValid(List[Char](), 0)
    }
}