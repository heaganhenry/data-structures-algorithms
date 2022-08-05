// Complete the method/function so that it converts dash/underscore delimited words into camel casing.

object CamelCase {
  def toCamelCase(str: String): String = {
    val splitStr = str.split("-|_")
    splitStr.head ++ splitStr.tail.map(_.capitalize).mkString
  }
}