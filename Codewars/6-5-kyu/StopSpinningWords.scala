// Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed.

object Codewars {
  def spinWords(sentence: String): String = {
    sentence.split(" ").map(word => {
      if (word.length < 5) word else word.reverse
    }).mkString(" ")
  }
}