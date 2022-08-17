// Given the head of a linked list, determine if the linked list has a cycle in it.
// Time O(n), Space O(n)

object Solution {
    def hasCycle(head: ListNode): Boolean = {
        @annotation.tailrec
        def hasCycleRec(node: ListNode, set: Set[ListNode]): Boolean = {
            if (node == null) false
            else if(set.contains(node)) true
            else hasCycleRec(node.next, set + node)
        }

        hasCycleRec(head, Set())
    }
}