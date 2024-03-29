// Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.
// Time O(n), Space O(1)

const middleNode = function (head) {
    let slow = fast = head;
    while (fast && fast.next) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
};