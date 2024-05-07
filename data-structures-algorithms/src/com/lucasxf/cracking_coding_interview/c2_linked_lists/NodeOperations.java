package com.lucasxf.cracking_coding_interview.c2_linked_lists;

public class NodeOperations {

    public Node deleteNode(Node head, int data) {
        if (head == null) {
            return null;
        }
        Node n = head;
        if (n.data == data) {
            return n.next;
        }
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

}
