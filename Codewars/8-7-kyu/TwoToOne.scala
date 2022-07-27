// Take 2 strings including only letters from a to z. Return the longest possible string, containing distinct letters - each taken only once - coming from s1 or s2.

object Kata {
  def longest(s1: String, s2: String): String =
    (s1 + s2).distinct.sorted
}