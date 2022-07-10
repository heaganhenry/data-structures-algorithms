// Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
// Essentially, rearrange the digits to create the highest possible number.

object Order {
  def descendingOrder(num: Int): Int =
    num.toString.sortWith(_ > _).toInt
}