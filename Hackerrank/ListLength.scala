// Count the number of elements in an array without using count, size or length operators (or their equivalents).

object Solution {

    def f(arr: List[Int]): Int =
        arr.foldLeft(0)((accumulator, _) => accumulator + 1)
}