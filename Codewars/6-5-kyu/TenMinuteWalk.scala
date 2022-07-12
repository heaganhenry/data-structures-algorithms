// You are given a sequence of characters representing the four main cardinal directions ('n', 's', 'e', 'w'), each of which takes 1 minute to travel. The sequence can contain any combination/exclusion of the characters.
// Determine if the given sequence will return you to your starting position and will take exactly 10 minutes to complete.

object Solution {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    walk.count(_ == 'n') == walk.count(_ == 's') &&
    walk.count(_ == 'w') == walk.count(_ == 'e') && walk.size == 10
  }
}