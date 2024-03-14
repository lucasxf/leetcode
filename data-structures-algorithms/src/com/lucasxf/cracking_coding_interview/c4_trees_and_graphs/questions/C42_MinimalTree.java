package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.BinaryTreeNode;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.TreeNode;

import java.util.*;

/**
 * Given a sorted (increasing order) array with unique integer elements,
 * write an algorithm to create a binary search tree with minimal height.
 * <p>
 * FAIL.
 */
public class C42_MinimalTree {

    public BinaryTreeNode minimalTree(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return new BinaryTreeNode();
        }
        int rootData = numbers.get(3);
        BinaryTreeNode root = new BinaryTreeNode(rootData);
        return insertIntoBST(root, numbers, 3);
    }

    private BinaryTreeNode insertIntoBST(BinaryTreeNode root, List<Integer> values, int index) {
        if (index >= values.size()) {
            return root;
        }
        System.out.println("index: " + index);
        int data = values.get(index);
        System.out.println("data " + data);
        if (root == null) {
            System.out.println("null");
            root = new BinaryTreeNode(data);
        }
        if (root.data > data) {
            root.left =
                    insertIntoBST(new BinaryTreeNode(data), values, --index);
            //insertIntoBST(root.left, values, ++index);
        } else {
            BinaryTreeNode aux = new BinaryTreeNode(data);
            root.left = root;
            insertIntoBST(aux.right, values, ++index);
        }
        System.out.println(root);
        return root;
    }

    /**
     * Book Solution
     */

    public BinaryTreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    private BinaryTreeNode createMinimalBST(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        BinaryTreeNode node = new BinaryTreeNode(arr[mid]);
        node.left = createMinimalBST(arr, start, mid - 1);
        node.right = createMinimalBST(arr, mid + 1, end);
        System.out.println(node);
        return node;
    }

}
