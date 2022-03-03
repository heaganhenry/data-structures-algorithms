# Given head, the head of a linked list, determine if the linked list has a cycle in it.

class Solution(object):
    def hasCycle(self, head):
        slow, fast = head, head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
            
        return False