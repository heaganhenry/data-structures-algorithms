// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

import scala.collection.mutable.Queue

class MyStack() {
    var queue = Queue[Int]()

    def push(x: Int): Unit = {
        val buffer = Queue(x)
        while (!queue.isEmpty) {
            buffer.enqueue(queue.dequeue)
        }
        queue = buffer
    }

    def pop(): Int = {
        queue.dequeue
    }

    def top(): Int = {
        queue.front
    }

    def empty(): Boolean = {
        queue.isEmpty
    }
}