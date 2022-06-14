// Return the middle character of the input word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

object MiddleChar {
  def middle(s: String): String =
    s.substring((s.length - 1) / 2, s.length / 2 + 1)
}