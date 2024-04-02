package com.lucasxf.leetcode.trees_and_graphs.trees.bfs;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNodes {

    public void printAllNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.println("Queue: " + queue);
        while (!queue.isEmpty()) {
            int nodesInCurrentLevel = queue.size();
            // do some logic here for the current level
            System.out.println("curr lv size: " + nodesInCurrentLevel);
            for (int i = 0; i < nodesInCurrentLevel; i++) {
                TreeNode node = queue.remove();

                // do some logic here on the current node
                //System.out.println("val: " + node.val);

                // put the next level onto the queue
                if (node.left != null) {
                    //     System.out.println("left");
                    queue.add(node.left);
                }
                if (node.right != null) {
                    //   System.out.println("right");
                    queue.add(node.right);
                }

                //System.out.println("q: " + queue);
            }
        }
    }

}
