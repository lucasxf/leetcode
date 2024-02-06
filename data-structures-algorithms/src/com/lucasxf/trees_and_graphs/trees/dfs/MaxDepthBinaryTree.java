package com.lucasxf.trees_and_graphs.trees.dfs;

import com.lucasxf.trees_and_graphs.trees.TreeNode;

/**
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaxDepthBinaryTree {

    int currDepth = 0;
    int maxDepth = 1;

    int leftDepth = 0;
    int rightDepth = 0;

    public int maxDepth(TreeNode root) {
        System.out.println("root: " + root);
        if (root == null) {
            maxDepth = Math.max(currDepth, maxDepth);
            return currDepth = 1;
        }
        currDepth++;
        maxDepth = Math.max(currDepth, maxDepth);
        System.out.println("max:  " + maxDepth);
        maxDepth(root.left);
        leftDepth = Math.max(currDepth, leftDepth);
        maxDepth(root.right);
        rightDepth = Math.max(currDepth, rightDepth);

        return Math.max(leftDepth, rightDepth);
    }

}
