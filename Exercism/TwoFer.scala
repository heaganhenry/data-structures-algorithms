// Given a name, return a string with the message: "One for name, one for me.", where "name" is the given name.
// However, if the name is missing, return the string: "One for you, one for me."

object Twofer {
  def twofer(name: String = "you"): String =
    s"One for $name, one for me."
}