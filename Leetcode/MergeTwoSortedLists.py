# You are given the heads of two sorted linked lists list1 and list2.
# Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

class Solution(object):
    def mergeTwoLists(self, list1, list2):
            dummy = ListNode()
            tail = dummy
            
            while list1 and list2:
                if list1.val < list2.val:
                    tail.next = list1
                    list1 = list1.next
                else:
                    tail.next = list2
                    list2 = list2.next
                tail = tail.next
            
            if list1:
                tail.next = list1
            elif list2:
                tail.next = list2
            
            return dummy.next