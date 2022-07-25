// Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
// If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

object Text {
  def order(str: String): String =
    str.split(' ').sortBy(_.find(_.isDigit)).mkString(" ")
}