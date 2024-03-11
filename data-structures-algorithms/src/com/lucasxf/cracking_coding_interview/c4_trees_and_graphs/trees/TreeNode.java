package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees;

import java.util.Arrays;

public class TreeNode {

    public int data;
    public TreeNode[] children;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode(int data, TreeNode[] children) {
        this.data = data;
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", children=" + Arrays.toString(children) +
                '}';
    }
    
}
