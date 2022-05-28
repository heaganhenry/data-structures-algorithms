// Using functional programming print "Hello World" N amount of times.

object Solution extends App {

    def f(n :Int): Unit = {
        def fTailrec(n: Int, acc: String): String =
            if (n <= 1) acc
            else fTailrec(n - 1, acc + "\nHello World")

        println(fTailrec(n, "Hello World"))
  }
}