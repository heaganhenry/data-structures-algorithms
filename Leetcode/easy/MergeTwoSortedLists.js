// You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list.
// The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
// Time O(min(m, n)), Space O(min(m, n))

const mergeTwoLists = function (list1, list2) {
    if (!list1) return list2;
    if (!list2) return list1;

    if (list1.val <= list2.val) {
        return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
    } else {
        return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
    }
};