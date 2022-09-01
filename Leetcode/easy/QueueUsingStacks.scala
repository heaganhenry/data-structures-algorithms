// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
// Amortized O(1) runtime

import scala.collection.mutable.Stack

class MyQueue() {
    val inStack = Stack[Int]()
    val outStack = Stack[Int]()

    def push(x: Int) = {
        inStack.push(x)
    }

    def pop(): Int = {
        peek()
        outStack.pop
    }

    def peek(): Int = {
        if (outStack.isEmpty) {
            while (!inStack.isEmpty) {
                outStack.push(inStack.pop)
            }
        }
        outStack.top
    }

    def empty(): Boolean = {
        inStack.isEmpty && outStack.isEmpty
    }
}