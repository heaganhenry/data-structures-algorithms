// Given the head of a linked list, determine if the linked list has a cycle in it.
// Time O(n), Space O(1)

object Solution {
    def hasCycle(head: ListNode): Boolean = {
        @annotation.tailrec
        def hasCycleRec(slow: ListNode, fast: ListNode): Boolean = {
            if (fast == null || fast.next == null) false
            else if (slow == fast) true
            else hasCycleRec(slow.next, fast.next.next)
        }

        if (head == null || head.next == null) false
        else hasCycleRec(head, head.next)
    }
}