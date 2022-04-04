// Simple, remove the spaces from the string, then return the resultant string.
// Time O(n), Space O(n)

object Kata {
  def noSpace(s: String): String =
    s.filter(_ != ' ')
}