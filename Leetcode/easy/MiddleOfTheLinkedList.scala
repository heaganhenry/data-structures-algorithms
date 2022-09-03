// Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.
// Time O(n), Space O(1)

object Solution {
    def middleNode(head: ListNode): ListNode = {
        def countNodes(head: ListNode, count: Int): Int = {
            if (head == null) count
            else countNodes(head.next, count + 1)
        }

        def getMiddle(node: ListNode, count: Int, current: Int): ListNode = {
            if (current == count / 2) node
            else getMiddle(node.next, count, current + 1)
        }

        val count = countNodes(head, 0)
        getMiddle(head, count, 0)
    }
}