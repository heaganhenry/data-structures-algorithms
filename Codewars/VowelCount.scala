// Return the number of vowels in the given string ('a', 'e' , 'i', 'o', 'u' but not 'y').

object Sol {
  def getCount(inputStr: String): Int = {
    inputStr.count("aeiou".contains(_))
  }
}