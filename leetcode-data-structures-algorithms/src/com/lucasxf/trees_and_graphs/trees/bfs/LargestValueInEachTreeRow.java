package com.lucasxf.trees_and_graphs.trees.bfs;

import com.lucasxf.trees_and_graphs.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 * <p>
 * SUCCESS
 */
public class LargestValueInEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        final List<Integer> largestValues = new ArrayList<>();
        final Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int max = Integer.MIN_VALUE;
        while (!nodes.isEmpty()) {
            int currRowSize = nodes.size();
            for (int i = 0; i < currRowSize; i++) {
                TreeNode node = nodes.remove();
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
                max = Math.max(max, node.val);
            }
            largestValues.add(max);
            max = Integer.MIN_VALUE;
        }
        return largestValues;
    }


}
