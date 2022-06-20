// Write a function that converts any sentence into a V A P O R W A V E sentence, i.e a sentence with all characters converted to uppercase and 2 spaces added between each char.
// Note that spaces should be ignored in this case.

object Vaporcode {
  def encode(s: String): String =
    s.filterNot(_.isWhitespace).toUpperCase.mkString("  ")
}