// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

import scala.collection.mutable.Stack

class MyQueue() {
    val s1 = Stack[Int]()
    val s2 = Stack[Int]()

    def push(x: Int) = {
        s1.push(x)
    }

    def pop(): Int = {
        if (s2.isEmpty) {
            while (!s1.isEmpty) {
                s2.push(s1.pop)
            }
        }

        s2.pop
    }

    def peek(): Int = {
        if (s2.isEmpty) {
            while (!s1.isEmpty) {
                s2.push(s1.pop)
            }
        }

        s2.top
    }

    def empty(): Boolean = {
        s1.isEmpty && s2.isEmpty
    }
}