// Given a sequence of a paremetric type write a function which returns the elements of the sequence
// without any elements with the same value next to each other and preserving the original order of elements.

object Kata {
  def uniqueInOrder[T](xs: Iterable[T]): Seq[T] =
    if (xs.isEmpty) Nil else xs.foldLeft(Seq[T](xs.head)) {
      (seq, elem) => if (seq.last == elem) seq else seq :+ elem
    }
}