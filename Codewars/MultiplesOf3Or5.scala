// Write a function that returns the sum of all the multiples of 3 or 5 of all natural numbers below the number passed in. 
// Additionally, if the number is negative, return 0
// Time O(n), Space(1)

object MultiplesOf3Or5 {   
    def solution(number: Int): Long = {
      if (number < 0) 0L
      (0L until number).filter(n => n % 3 == 0 || n % 5 == 0).sum
    }
}