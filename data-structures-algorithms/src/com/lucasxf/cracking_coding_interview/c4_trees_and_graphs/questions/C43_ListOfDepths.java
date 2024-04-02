package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, design an algorithm which creates a linked list
 * of all the nodes at each depth (e.g., if you have a tree with depth D,
 * you'll have D linked lists).
 */
public class C43_ListOfDepths {

    static class ListNode {

        ListNode next;
        int data;

        public ListNode(int data) {
            this.data = data;
        }

        void appendToTail(int data) {
            ListNode end = new ListNode(data);
            ListNode n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    public List<ListNode> listsOfDepths(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        List<ListNode> listOfLinkedLists = new ArrayList<>();
        int j = 0;
        while (!treeNodes.isEmpty()) {
            ListNode listNode = null;
            int currLevelSize = treeNodes.size();
            System.out.println("Iteration: " + ++j);
            System.out.println("Lvl size:  " + currLevelSize);
            System.out.println("Full tree: " + treeNodes);
            for (int i = 0; i < currLevelSize; i++) {
                BinaryTreeNode treeNode = treeNodes.remove();
                System.out.println("Tree node: " + treeNode);
                if (listNode == null) {
                    listNode = new ListNode(treeNode.data);
                } else {
                    listNode.appendToTail(treeNode.data);
                }
                if (treeNode.left != null) {
                    treeNodes.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    treeNodes.add(treeNode.right);
                }
            }
            System.out.println("List node: " + listNode);
            System.out.println();
            listOfLinkedLists.add(listNode);
        }
        System.out.println("Size: " + listOfLinkedLists.size());
        System.out.println(listOfLinkedLists);
        return listOfLinkedLists;
    }
}
