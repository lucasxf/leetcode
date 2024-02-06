package com.lucasxf.trees_and_graphs.trees.dfs;

import com.lucasxf.trees_and_graphs.trees.TreeNode;

/***
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 */
public class MinDepthBinaryTree {

    int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 1);
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
        if (node.left == null && node.right == null) {
            min = Math.min(depth, min);
            return depth;
        }
        return min;
    }

}
