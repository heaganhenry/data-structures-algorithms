// Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

object ExesAndOhs {
  def xo(str: String): Boolean =
    str.count(_.toLower == 'x') == str.count(_.toLower == 'o')
}