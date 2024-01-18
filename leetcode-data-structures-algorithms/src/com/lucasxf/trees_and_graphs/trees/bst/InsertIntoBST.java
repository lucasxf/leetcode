package com.lucasxf.trees_and_graphs.trees.bst;

import com.lucasxf.trees_and_graphs.trees.TreeNode;
import com.sun.source.tree.Tree;

/**
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion.
 * It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class InsertIntoBST {

    // My SUCCESSFUL Solution
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        dfs(root, val);
        return root;
    }

    private void dfs(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (root.val > val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return;
            }
            insertIntoBST(root.left, val);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                insertIntoBST(root.right, val);
            }
        }
    }

    // LeetCode solution
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) return new TreeNode(val);

            // insert into the right subtree
            if (val > root.val) root.right = insertIntoBST(root.right, val);
                // insert into the left subtree
            else root.left = insertIntoBST(root.left, val);
            return root;
        }
    }

}
