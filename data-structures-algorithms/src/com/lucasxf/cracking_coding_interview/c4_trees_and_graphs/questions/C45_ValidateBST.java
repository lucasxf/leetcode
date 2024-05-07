package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.BinaryTreeNode;

/**
 * Implement a function to check if a binary tree is a binary search tree (BST).
 */
public class C45_ValidateBST {

    public boolean validate(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        return checkNode(root) && checkLeft(root.left, root.data) && checkRight(root.right, root.data);
    }

    private boolean checkLeft(BinaryTreeNode node, int max) {
        if (node == null) {
            return true;
        }
        System.out.printf("L [%d]%n", node.data);
        if (node.data > max) {
            System.out.println("Max L node: " + node.data);
            return false;
        }
        return checkNode(node) && checkLeft(node.left, max) && checkLeft(node.right, max);
    }

    private boolean checkRight(BinaryTreeNode node, int min) {
        if (node == null) {
            return true;
        }
        System.out.printf("R [%d]%n", node.data);
        if (node.data < min) {
            System.out.println("Min R node: " + node.data);
            return false;
        }
        return checkNode(node) && checkRight(node.left, min) && checkRight(node.right, min);
    }

    private boolean checkNode(BinaryTreeNode node) {
        if (node == null) {
            return true;
        }
        System.out.printf("N [%d]%n", node.data);
        if (node.left != null) {
            if (node.left.data > node.data) {
                System.out.println("Invalid L node: " + node.left.data);
                return false;
            }
        }
        if (node.right != null) {
            if (node.right.data < node.data) {
                System.out.println("Invalid R node: " + node.right.data);
                return false;
            }
        }
        return true;
    }

}