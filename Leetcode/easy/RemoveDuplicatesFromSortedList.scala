// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
// Time O(n), Space O(1)

object Solution {
    def deleteDuplicates(head: ListNode): ListNode = {
        if (head == null || head.next == null) head
        else {
            head.next = deleteDuplicates(head.next)
            if (head.next != null && head.x == head.next.x) {
                head.next = head.next.next
            }
            head
        }
    }
}