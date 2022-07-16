// Simple, given a string of words, return the length of the shortest word(s).

object Shortest {
  def findShort(str: String): Int = str.split(' ').map(_.size).min
}