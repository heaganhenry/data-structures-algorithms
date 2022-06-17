// Given a string of words (x), you need to return an array of the words, sorted alphabetically by the final character in each.

object Kata {
  def last(s: String): Array[String] =
    s.split(" ").sortBy(_.last)
}