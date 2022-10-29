// You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list.
// The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
// Time O(n + m), Space O(n + m)

const mergeTwoLists = function (list1, list2) {
    let head = new ListNode(-1, null);
    let curr = head;

    while (list1 && list2) {
        if (list1.val <= list2.val) {
            curr.next = list1;
            list1 = list1.next;
        } else {
            curr.next = list2;
            list2 = list2.next;
        }
        curr = curr.next;
    }
    curr.next = (list1 || list2);

    return head.next;
};