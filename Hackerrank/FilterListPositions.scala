// For a given list with N integers, return a new list removing the elements at odd positions.

object Solution {

    def f(arr: List[Int]): List[Int] =
        arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
}