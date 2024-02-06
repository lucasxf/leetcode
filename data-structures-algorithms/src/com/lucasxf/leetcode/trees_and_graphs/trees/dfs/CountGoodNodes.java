package com.lucasxf.leetcode.trees_and_graphs.trees.dfs;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

public class CountGoodNodes {

    int goodNodes = 0;

    public int goodNodes(TreeNode root) {
        return countNodes(root, root.val, root.val);
    }

    private int countNodes(TreeNode root, int rootVal, int max) {
        if (root == null) {
            return 0;
        }
        int curr = root.val;
        int maxVal = Math.max(curr, max);
        if (curr >= maxVal) {
            goodNodes++;
        }
        if (root.left == null && root.right == null) {
            maxVal = rootVal;
        } else {
            rootVal = curr;
        }
        countNodes(root.left, rootVal, maxVal);
        countNodes(root.right, rootVal, maxVal);
        return goodNodes;
    }

}
