// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number. All numbers are valid Int32, no need to validate them.
// The string will always have at least 1 number. Output string must be two numbers separated by a single space, and highest number is first.

object Sol {
  def highAndLow2(numbers: String): String = {
    val nums = numbers.split(' ').map(_.toInt)
    s"${nums.max} ${nums.min}"
  }
}