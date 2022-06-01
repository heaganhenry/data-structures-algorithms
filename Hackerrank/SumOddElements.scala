// Given a list of integers, return the sum of odd elements from the given list.

object Solution {

    def f(arr: List[Int]): Int =
        arr.filter(_ % 2 != 0).sum
}