package com.lucasxf.linked_lists.fast_and_slow_pointers;

import com.lucasxf.linked_lists.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return slow;
            }
        }
        return slow;
    }

}
