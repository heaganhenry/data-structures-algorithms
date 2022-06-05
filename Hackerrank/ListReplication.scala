// Given a list, repeat each element in the list N amount of times.

object Solution {
    def f(num: Int, arr: List[Int]): List[Int] =
        arr.flatMap(x => List.fill(num)(x))
}