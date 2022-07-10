// Your task is to write function concatOption that will take 2 Option[String]s and return a new Option[String] which contains the concatenation of those strings with a space between them.

object Kata {
  def concatOption(first: Option[String], second: Option[String]) =
    if (first.isDefined && second.isDefined) Some(s"${first.get} ${second.get}") else None
}