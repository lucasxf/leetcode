package com.lucasxf.leetcode.linked_lists.reverse_linked_lists;

import com.lucasxf.leetcode.linked_lists.ListNode;

import java.sql.SQLOutput;

/**
 * Given the head of a singly linked list and two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, and return the reversed list.
 */
public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int length = 1;
        if (left > right) {
            return head;
        }
        System.out.println("Left: " + left);
        System.out.println("Right: " + right);
        ListNode prev = null;
        ListNode curr = head;
        ListNode aux = head;
        while (aux != null && aux.next != null) {
            System.out.println("Length OUT: " + length);
            while (curr != null && length >= left && length <= right) {
                System.out.println("Length IN: " + length);
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
                length++;
            }
            aux = aux.next;
            length++;
        }
        System.out.println("Head: " + head);
        System.out.println("Aux:  " + aux);
        System.out.println("curr: " + curr);
        return prev;
    }

}
