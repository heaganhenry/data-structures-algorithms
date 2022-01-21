// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

public class Solution 
{
    public ListNode MergeTwoLists(ListNode list1, ListNode list2) 
    {
        var dummy = new ListNode();
        var tail = dummy;
        
        while (list1 != null && list2 != null)
        {
            if (list1.val < list2.val)
            {
                tail.next = list1;
                list1 = list1.next;
            }
            else
            {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        if (list1 != null)
            tail.next = list1;
        else if (list2 != null)
            tail.next = list2;
        
        return dummy.next;
    }
}