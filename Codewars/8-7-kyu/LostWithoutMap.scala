// Given an array of integers, return a new array with each value doubled (without using map?).

object Kata {
  def maps(xs: List[Int]): List[Int] =
    xs.flatMap(x => List.fill(1)(x * 2))
}