package com.lucasxf.cracking_coding_interview.c2_linked_lists;

public class Node {

    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        appendNodeToTail(new Node(data));
    }

    public void appendNodeToTail(Node end) {
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = n;
    }

}
