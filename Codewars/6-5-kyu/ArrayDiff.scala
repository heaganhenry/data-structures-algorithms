// Implement a difference function, which remove all values from list a, which are present in list b keeping their order.

object Kata {
  def arrayDiff(a: Seq[Int], b: Seq[Int]) = {
    val fastLookup = b.toSet
    a.filterNot(fastLookup)
  }
}