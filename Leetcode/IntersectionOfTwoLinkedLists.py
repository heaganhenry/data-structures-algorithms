# Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        curA, curB = headA, headB
        
        while curA != curB:
            curA = curA.next if curA else headB
            curB = curB.next if curB else headA
        return curA