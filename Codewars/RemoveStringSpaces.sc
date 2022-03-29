// Simple, remove the spaces from the string, then return the resultant string.

object Kata {

  def noSpace(s: String): String =
    s.filter(_ != ' ')
}