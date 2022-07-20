// In this kata you are required to, given a string, replace every letter with its position in the alphabet. If anything in the text isn't a letter, ignore it and don't return it.

object Kata {
  def alphabetPosition(text: String): String =
    text.filter(_.isLetter).map(_.toLower - 96).mkString(" ")
}