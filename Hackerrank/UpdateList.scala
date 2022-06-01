// Update the values of a list with their absolute values.

object Solution {

    def f(arr: List[Int]): List[Int] =
        arr.map(Math.abs(_))
}