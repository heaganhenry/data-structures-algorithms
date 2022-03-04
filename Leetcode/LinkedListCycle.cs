// Given head, the head of a linked list, determine if the linked list has a cycle in it.

public class Solution 
{
    public bool HasCycle(ListNode head) 
    {
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        
        return false;
    }
}