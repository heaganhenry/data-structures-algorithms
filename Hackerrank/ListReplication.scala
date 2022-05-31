// Given a list, repeat each element in the list n amount of times.

object Solution {

    def f(num: Int, arr: List[Int]): List[Int] =
        arr.flatMap(x => List.fill(num)(x))
}