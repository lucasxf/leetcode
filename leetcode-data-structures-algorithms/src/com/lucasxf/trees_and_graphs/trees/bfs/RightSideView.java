package com.lucasxf.trees_and_graphs.trees.bfs;

import com.lucasxf.trees_and_graphs.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> view = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int currLevel = queue.size();
            for (int i = 0; i < currLevel; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (i + 1 == currLevel) {
                    view.add(node.val);
                }
            }
        }
        return view;
    }

}
