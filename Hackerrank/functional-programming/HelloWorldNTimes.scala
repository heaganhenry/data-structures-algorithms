// Print "Hello World" N amount of times with functional programming.

object Solution {
    def f(n : Int): Unit = {
        println("Hello World")
        if (n > 1) f(n - 1)
    }
}