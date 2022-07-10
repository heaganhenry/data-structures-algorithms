// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
// If a number is a multiple of both 3 and 5, only count it once. Additionally, if the number is negative, return 0.

object MultiplesOf3Or5 {
    def solution(number: Int): Long =
      (1L until number).filter(n => n % 5 == 0 || n % 3 == 0 ).sum
}