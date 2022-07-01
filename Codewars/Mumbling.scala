// Write a function that takes a string as input and creates an output string as seen in the given examples.
// "abcd" -> "A-Bb-Ccc-Dddd", "RqaEzty" -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", "cwAt" -> "C-Ww-Aaa-Tttt"

object Codewars {
  def accum(s: String) =
    s.indices.map(i => (s(i).toLower.toString * (i + 1)).capitalize).mkString("-")
}