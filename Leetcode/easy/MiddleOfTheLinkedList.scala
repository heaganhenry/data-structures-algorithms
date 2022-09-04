// Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.
// Time O(n), Space O(1)

object Solution {
    def middleNode(head: ListNode): ListNode = {
        def getMiddle(slow: ListNode, fast: ListNode): ListNode = {
            if (fast == null || fast.next == null) slow
            else getMiddle(slow.next, fast.next.next)
        }

        getMiddle(head, head)
    }
}