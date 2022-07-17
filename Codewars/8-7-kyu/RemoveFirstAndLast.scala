// Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string.
// You don't have to worry with strings with less than two characters.

object RemoveFirstAndLastCharacters {
  def removeChars(s: String): String = s.substring(1, s.length - 1)
}