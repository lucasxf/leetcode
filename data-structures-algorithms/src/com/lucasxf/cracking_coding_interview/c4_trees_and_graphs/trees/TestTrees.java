package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees;

public class TestTrees {

    public static void printRegularTree() {
        System.out.println("Tree: " + getRegularTree());
    }

    public static TreeNode getRegularTree() {
        TreeNode leaf2 = new TreeNode(2);
        TreeNode leaf1 = new TreeNode(1);
        TreeNode leaf20 = new TreeNode(20);
        TreeNode[] leftChildren = new TreeNode[]{leaf2, leaf1};
        TreeNode left4 = new TreeNode(4, leftChildren);
        TreeNode[] rightChildren = new TreeNode[]{leaf20};
        TreeNode right10 = new TreeNode(10, rightChildren);
        TreeNode middle6 = new TreeNode(6);
        return new TreeNode(8, new TreeNode[]{left4, middle6, right10});
    }

    public static void printBinarySearchTree() {

    }

}
