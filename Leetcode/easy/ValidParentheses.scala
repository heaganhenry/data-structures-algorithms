// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if: Open brackets must be closed by the same type of brackets. + Open brackets must be closed in the correct order.
// Time O(n), Space O(n)

object Solution {
    def isValid(s: String): Boolean = {
        val closeToOpen = Map(')' -> '(', ']' -> '[', '}' -> '{')

        @annotation.tailrec
        def isValidRec(remaining: String, stack: List[Char]): Boolean = {
            if (remaining.isEmpty) stack.isEmpty
            else if (stack.nonEmpty && closeToOpen.contains(remaining.head) && stack.head == closeToOpen(remaining.head)) {
                isValidRec(remaining.tail, stack.tail)
            } else isValidRec(remaining.tail, remaining.head :: stack)
        }

        isValidRec(s, List())
    }
}