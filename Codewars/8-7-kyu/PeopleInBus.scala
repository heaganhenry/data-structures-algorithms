// You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people coming on (first item) and off (second item) at the bus stop.
// Your task is to return the number of people who are still in the bus after the last bus station.

object Bus {
  def number(busStops: List[(Int, Int)]): Int =
    busStops.foldLeft(0) { case (acc, (on, off)) => acc + on - off }
}