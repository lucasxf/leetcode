package com.lucasxf.linked_lists.fast_and_slow_pointers;

import com.lucasxf.linked_lists.ListNode;

public class DeleteDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            System.out.println("s - " + fast);
            if (fast.val == fast.next.val) {
                fast.next = fast.next.next;
            } else {
                fast = fast.next;
            }
            System.out.println("e - " + fast);
        }
        return head;

    }

}
