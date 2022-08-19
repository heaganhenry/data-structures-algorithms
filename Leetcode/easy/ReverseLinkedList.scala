// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Time O(n), Space O(1)

object Solution {
    def reverseList(head: ListNode): ListNode = {
        @annotation.tailrec
        def reverseRec(prev: ListNode, cur: ListNode, next: ListNode): ListNode = {
            cur.next = prev
            if (next != null) reverseRec(cur, next, next.next)
            else cur
        }

        if (head == null) head
        else reverseRec(null, head, head.next)
    }
}