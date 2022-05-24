// Given a year, report if it is a leap year. A leap year in the Gregorian calendar occurs:
// On every year that is evenly divisible by 4, except every year that is evenly divisible by 100, unless the year is also evenly divisible by 400.

object Leap {
  def leapYear(year: Int): Boolean =
    (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0)
}