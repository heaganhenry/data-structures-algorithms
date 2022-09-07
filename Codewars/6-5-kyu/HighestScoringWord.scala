// Given a string of words, you need to find the highest scoring word. Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
// If two words score the same, return the word that appears earliest in the original string. All letters will be lowercase and all inputs will be valid.

object Scoring {
  def high(s: String): String =
    s.split(" ").maxBy(_.map(_ - 96).sum)
}