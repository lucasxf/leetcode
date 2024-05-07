package com.lucasxf.cracking_coding_interview.c2_linked_lists.questions;


import com.lucasxf.cracking_coding_interview.c2_linked_lists.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * <p>
 * Follow Up
 * <p>
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class C21_RemoveDups {

    public void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }
        Node n = head;
        Set<Integer> ints = new HashSet<>();
        ints.add(n.data);
        while (n.next != null) {
            int d = n.next.data;
            if (ints.contains(d)) {
                n.next = n.next.next;
            } else {
                
            }
            n = n.next;
        }
    }
}
