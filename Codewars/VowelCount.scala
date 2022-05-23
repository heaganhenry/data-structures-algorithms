// Return the number (count) of vowels in the given string. The input string will only consist of lower case letters and/or spaces.

object Sol {
  def getCount(inputStr: String): Int = {
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    inputStr.count(vowels)
  }
}