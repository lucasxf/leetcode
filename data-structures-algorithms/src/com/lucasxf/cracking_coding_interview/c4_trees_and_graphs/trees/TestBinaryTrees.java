package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees;

public class TestBinaryTrees {

    public static BinaryTreeNode getPerfectBinarySearchTree() {
        // left side
        BinaryTreeNode leaf2 = new BinaryTreeNode(2);
        BinaryTreeNode leaf6 = new BinaryTreeNode(6);
        BinaryTreeNode node4 = new BinaryTreeNode(4, leaf2, leaf6);
        // right side
        BinaryTreeNode leaf10 = new BinaryTreeNode(10);
        BinaryTreeNode leaf14 = new BinaryTreeNode(14);
        BinaryTreeNode node12 = new BinaryTreeNode(12, leaf10, leaf14);
        // root
        return new BinaryTreeNode(8, node4, node12);
    }

    public static BinaryTreeNode getBinaryTree() {
        // left side
        BinaryTreeNode leaf2 = new BinaryTreeNode(2);
        BinaryTreeNode leaf6 = new BinaryTreeNode(6);
        BinaryTreeNode node4 = new BinaryTreeNode(4, leaf2, leaf6);
        // right side
        BinaryTreeNode leaf10 = new BinaryTreeNode(10);
        BinaryTreeNode leaf14 = new BinaryTreeNode(14);
        BinaryTreeNode node12 = new BinaryTreeNode(12, leaf10, leaf14);
        // root
        return new BinaryTreeNode(8, node12, node4);
    }

    public static void printPerfectBST() {
        BinaryTreeNode bst = getPerfectBinarySearchTree();
        System.out.println(bst);
    }

    public static void inOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    private static void visit(BinaryTreeNode node) {
        System.out.println(node);
    }

}
