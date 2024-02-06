package com.lucasxf.leetcode.trees_and_graphs.trees.dfs;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class SameTree {

    private boolean lastNode;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return false;
        }
        return dfs(p, q);
    }

    private boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            System.out.println("finish");
            return lastNode;
        } else if (p == null || q == null) {
            System.out.println("here");
            return false;
        }
        System.out.println("P: " + p);
        System.out.println("Q: " + q);
        lastNode = p.val == q.val;
        boolean leftSide = lastNode && dfs(p.left, q.left);
        System.out.println("L: " + leftSide);
        boolean rightSide = lastNode && dfs(p.right, q.right);
        System.out.println("R: " + rightSide);
        return leftSide && rightSide;
    }

}
