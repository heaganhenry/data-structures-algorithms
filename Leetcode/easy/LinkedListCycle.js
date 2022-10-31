// Given the head of a linked list, determine if the linked list has a cycle in it.
// Time O(n), Space O(1)

const hasCycle = function (head) {
    let fast = head;

    while (fast && fast.next) {
        head = head.next;
        fast = fast.next.next;
        if (fast === head) return true;
    }

    return false;
};