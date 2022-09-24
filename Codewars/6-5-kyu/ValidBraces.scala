// Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
// All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

object Kata {
  def validBraces(s: String): Boolean = {
    val closeToOpen = Map(')' -> '(', ']' -> '[', '}' -> '{')

    @annotation.tailrec
    def isValid(string: String, stack: List[Char]): Boolean = {
      if (string.isEmpty) stack.isEmpty
      else if (stack.nonEmpty && closeToOpen.contains(string.head) && closeToOpen(string.head) == stack.head) {
        isValid(string.tail, stack.tail)
      } else isValid(string.tail, string.head :: stack)
    }

    isValid(s, List())
  }
}