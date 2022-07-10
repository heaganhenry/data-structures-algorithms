// You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list.
// The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
// Time O(n + m), Space O(n + m)

object Solution {
    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
        (list1, list2) match {
            case (null, _) => list2
            case (_, null) => list1
            case (list1, list2) => {
                if (list1.x < list2.x) new ListNode(list1.x, mergeTwoLists(list1.next, list2))
                else new ListNode(list2.x, mergeTwoLists(list1, list2.next))
            }
        }
    }
}