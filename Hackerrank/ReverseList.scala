// Given a list of N elements, reverse the list without using the reverse function.

object Solution {

    def f(arr: List[Int]): List[Int] =
        arr.foldLeft(List[Int]())((accumulator, value) => value :: accumulator)
}