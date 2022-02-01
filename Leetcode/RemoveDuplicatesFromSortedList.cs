// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class Solution 
{
    public ListNode DeleteDuplicates(ListNode head) 
    {
        var cur = head;
        
        while (cur != null)
        {
            while (cur.next != null && cur.val == cur.next.val)
                cur.next = cur.next.next;
            cur = cur.next;
        }
        
        return head;
    }
}