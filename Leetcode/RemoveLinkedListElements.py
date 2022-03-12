# Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

class Solution(object):
    def removeElements(self, head, val):
        dummy = ListNode(next=head)
        prev, cur = dummy, head
        
        while cur:
            nxt = cur.next
            
            if cur.val == val:
                prev.next = nxt
            else:
                prev = cur
        
            cur = nxt
        return dummy.next