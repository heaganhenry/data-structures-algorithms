// Filter a given array of integers and output only those values that are less than a specified value X without using filter. The output should be in the same sequence as the input.

object Solution {
    def f(delim: Int, arr: List[Int]): List[Int] =
        for (i <- arr if i < delim) yield i
}