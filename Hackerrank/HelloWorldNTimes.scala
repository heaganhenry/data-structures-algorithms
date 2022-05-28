// Using functional programming print "Hello World" N amount of times.

object Solution extends App {

    def f(n : Int): Unit = {
        println("Hello World")
        if (n > 1) f(n-1)
    }
}