package com.lucasxf.leetcode.trees_and_graphs.trees.bst;

import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

    private boolean isValid = true;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        min = root.val;
        max = root.val;
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        System.out.println("node: " + root);
        if (root == null) {
            return true;
        }
        System.out.println("val: " + root.val);
        if (root.left != null) {
            max = Math.max(max, root.left.val);
        }
        if (root.right != null) {
            min = Math.min(min, root.right.val);
        }
        dfs(root.left);
        dfs(root.right);
        if (root.val < max) {
            System.out.println("max");
            isValid = false;
        }
        if (root.val > min) {
            System.out.println("min");
            isValid = false;
        }
        return isValid && root.val > max && root.val < min;
    }

    /*
    private boolean dfs(TreeNode root, List<Integer> leftValues, List<Integer> rightValues) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            leftValues.add(root.left.val);
        }
        if (root.right != null) {
            rightValues.add(root.right.val);
        }
        for (int l : leftValues) {
            if (l > root.val) {
                isValid = false;
                return false;
            }
        }
        for (int r : rightValues) {
            if (r < root.val) {
                isValid = false;
                return false;
            }
        }
        return isValid && dfs(root.left, leftValues, rightValues) && dfs(root.right, leftValues, rightValues);
    }*/

}
