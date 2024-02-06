package com.lucasxf.leetcode.trees_and_graphs.trees.bfs;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            int currLevelSize = queue.size();
            List<Integer> values = new ArrayList<>();
            System.out.println("s: " + zigzag);
            for (int i = 0; i < currLevelSize; i++) {
                TreeNode node = queue.remove();
                values.add(node.val);
                System.out.println(node);
                if (!zigzag) {
                    System.out.println("right");
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                } else {
                    System.out.println("left");
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            System.out.println(values);
            zigzag = !zigzag;
            answer.add(values);
            System.out.println("e: " + zigzag);
        }
        return answer;
    }

}
