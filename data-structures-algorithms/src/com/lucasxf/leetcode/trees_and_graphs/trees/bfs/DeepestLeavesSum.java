package com.lucasxf.leetcode.trees_and_graphs.trees.bfs;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, return the sum of values of its deepest leaves.
 */
public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int answer = 0;
        while (!queue.isEmpty()) {
            int helper = 0;
            int currLevelSize = queue.size();
            for (int i = 0; i < currLevelSize; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                helper += node.val;
            }
            answer = helper;
        }
        return answer;
    }

}
