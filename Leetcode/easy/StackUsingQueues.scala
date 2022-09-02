// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
// (Using only one queue)

import scala.collection.mutable.Queue

class MyStack() {
    var queue = Queue[Int]()

    def push(x: Int): Unit = {
        queue.enqueue(x)
        (0 until queue.size - 1).foreach { _ =>
            queue.enqueue(queue.dequeue())
        }
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