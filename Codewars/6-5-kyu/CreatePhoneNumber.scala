// Write a function that accepts an array of 10 integers (between 0 and 9) and returns a string of those numbers in the form of a phone number, e.g. "(xxx) xxx-xxx".

object Kata {
  def createPhoneNumber(numbers: Seq[Int]): String = {
    val nums = numbers.mkString
    s"(${nums.take(3)}) ${nums.slice(3,6)}-${nums.drop(6)}"
  }
}