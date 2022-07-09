// The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string.
// Ignore capitalization when determining if a character is a duplicate.

object Solution {
  def duplicateEncode(word: String): String = {
    val wordLower = word.toLowerCase
    val charMap = wordLower.groupBy(identity).view.mapValues(_.length).toMap
    wordLower.map(c => if (charMap(c) > 1) ')' else '(')
  }
}