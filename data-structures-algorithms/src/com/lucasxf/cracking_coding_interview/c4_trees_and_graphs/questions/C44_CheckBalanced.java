package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.BinaryTreeNode;

/**
 * Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be
 * a tree such that the height of the two subtrees of any node never
 * differ by more than one.
 */
public class C44_CheckBalanced {

    public boolean checkBalanced(BinaryTreeNode root) {
        if (root == null) {
            return false;
        }
        int leftHeight = calcTreeHeight(root.left);
        int rightHeight = calcTreeHeight(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1;
    }

    private int calcTreeHeight(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = calcTreeHeight(node.left);
        int right = calcTreeHeight(node.right);
        return Math.max(left, right) + 1;
    }

}
