// Given a string of n lines with each substring being n characters long, write a function that scales each character k times and each substring n times.
// If strng == "" return "".

object Kata {
  def scale(xs: String, k: Int, n: Int): String = {
    if (xs == "") ""
    else xs.split("\n").flatMap(w => List.fill(n)(w.map(_.toString * k).mkString)).mkString("\n")
  }
}