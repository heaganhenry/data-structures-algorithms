// Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:
// - Starting with any positive integer, replace the number by the sum of the squares of its digits.
// - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// - Those numbers for which this process ends in 1 are happy.
// Time O(n), Space O(1)

object Solution {
    def isHappy(n: Int): Boolean = {
        (0 to 10).foldLeft(n) { (num, _) =>
            num.toString.map(c => c.asDigit * c.asDigit).sum } == 1
    }
}