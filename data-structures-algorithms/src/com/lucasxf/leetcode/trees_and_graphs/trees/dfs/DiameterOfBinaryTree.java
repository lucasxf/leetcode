package com.lucasxf.leetcode.trees_and_graphs.trees.dfs;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * <p>
 * The length of a path between two nodes is represented by the number of edges between them.
 */
public class DiameterOfBinaryTree {

    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 0, 0);
    }

    private int dfs(TreeNode root, int maxDepth, int currDepth) {
        if (root == null) {
            return maxDepth; // TODO
        }
        diameter = Math.max(currDepth, maxDepth) + 1;
        if (root.left == null && root.right == null) {
            return maxDepth;
        }
        int left = dfs(root.left, maxDepth, currDepth + 1);
        int right = dfs(root.right, maxDepth, currDepth + 1);
        return Math.max(left, right);
    }

    class Solution {
        private int diameter;

        public int diameterOfBinaryTree(TreeNode root) {
            diameter = 0;
            longestPath(root);
            return diameter;
        }

        private int longestPath(TreeNode node) {
            if (node == null) return 0;
            // recursively find the longest path in
            // both left child and right child
            int leftPath = longestPath(node.left);
            int rightPath = longestPath(node.right);

            // update the diameter if left_path plus right_path is larger
            diameter = Math.max(diameter, leftPath + rightPath);

            // return the longest one between left_path and right_path;
            // remember to add 1 for the path connecting the node and its parent
            return Math.max(leftPath, rightPath) + 1;
        }
    }
}
