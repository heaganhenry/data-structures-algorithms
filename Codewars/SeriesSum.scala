// Your task is to write a function which returns the sum of the following series up to the nth term, rounded to 2 decimal places.
// Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

object Sol {
  def seriesSum(n: Int): String = {
    @annotation.tailrec
    def seriesSumRec(i: Int, sum: Float, divisor: Float): String = {
      if (n == i) f"${sum}%.2f"
      else seriesSumRec(i + 1, sum + (1 / divisor), divisor + 3)
    }

    seriesSumRec(0, 0, 1)
  }
}