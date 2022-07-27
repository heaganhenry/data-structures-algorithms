// Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
// The length of the array will always be at least 2 and there will always be one missing letter.

object Kata {
  def findMissingLetter(chars: Array[Char]): Char = {
    val adjacent = chars.zip(chars.tail)
    (adjacent.find(pair => pair._2 - pair._1 > 1).get._2 - 1).toChar
  }
}