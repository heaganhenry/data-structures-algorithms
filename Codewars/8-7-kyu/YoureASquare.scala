// Given an integral number, determine if it's a square number.

object Sol {
  def isSquare(x: Int): Boolean = math.sqrt(x).isWhole
}