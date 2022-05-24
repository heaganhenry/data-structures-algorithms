// Write a function that returns the sum of all the multiples of 3 or 5 of all natural numbers below the number passed in. If the number is negative, return 0

object Kata {

    def MultiplesOf3Or5(number: Int): Long =
      if (number < 0) 0L
      (0L until number).filter(n => n % 3 == 0 || n % 5 == 0).sum
}