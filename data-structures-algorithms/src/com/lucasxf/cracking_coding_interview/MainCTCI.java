package com.lucasxf.cracking_coding_interview;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.AdjacencyListGraph;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.Node;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions.*;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.BinaryTreeNode;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.TestBinaryTrees;

import java.util.*;

public class MainCTCI {

    public static void main(String[] args) {
        MainCTCI main = new MainCTCI();
        //main.testC41();
        //main.testC42();
        //main.testC43();
        //main.testC44();
        main.testC45();
    }

    void testC45() {
        C45_ValidateBST c45 = new C45_ValidateBST();
        /*
        BinaryTreeNode binaryTree = TestBinaryTrees.getBinaryTree();
        BinaryTreeNode bst = TestBinaryTrees.getPerfectBinarySearchTree();
        boolean validateBT = c45.validate(binaryTree, binaryTree.data, binaryTree.data);
        System.out.println(validateBT); // false
        boolean validateBST = c45.validate(bst, bst.data, bst.data);
        System.out.println(validateBST); // true
        boolean validateSingleRoot = c45.validate(new BinaryTreeNode(1), 1, 1);
        System.out.println(validateSingleRoot); // true
        */
        BinaryTreeNode ll2 = new BinaryTreeNode(2);
        BinaryTreeNode lr12 = new BinaryTreeNode(6);
        BinaryTreeNode l4 = new BinaryTreeNode(4, ll2, lr12);
        BinaryTreeNode rr20 = new BinaryTreeNode(20);
        BinaryTreeNode r10 = new BinaryTreeNode(10, new BinaryTreeNode(8), rr20);
        BinaryTreeNode root = new BinaryTreeNode(8, l4, r10);
        System.out.println(root);
        boolean validate = c45.validate(root);
        System.out.println(validate); // false - came true, wrong alg
    }

    void testC44() {
        C44_CheckBalanced c44 = new C44_CheckBalanced();
        boolean isBalanced = c44.checkBalanced(TestBinaryTrees.getPerfectBinarySearchTree());
        System.out.println("Balanced? " + isBalanced);
    }

    void testC43() {
        C43_ListOfDepths c43 = new C43_ListOfDepths();
        c43.listsOfDepths(TestBinaryTrees.getPerfectBinarySearchTree());
    }

    void testC42() {
        // my solution (FAIL)
        C42_MinimalTree c42 = new C42_MinimalTree();
        //c42.minimalTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        // Book solution
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        BinaryTreeNode minimalBST = c42.createMinimalBST(arr);
    }

    void testC41() {
        C41_RouteBetweenNodes c41 = new C41_RouteBetweenNodes();
        AdjacencyListGraph graph = new AdjacencyListGraph();
        Map<Node, List<Node>> adjacentVertices = new HashMap<>();
        Node nA = new Node("A");
        Node nB = new Node("B");
        Node nC = new Node("C");
        Node nD = new Node("D");
        Node nE = new Node("E");
        Node nF = new Node("F");
        adjacentVertices.put(nA, Arrays.asList(nC, nB));
        adjacentVertices.put(nB, Arrays.asList(nD));
        adjacentVertices.put(nC, Arrays.asList(nE));
        adjacentVertices.put(nD, Arrays.asList(nF));
        adjacentVertices.put(nE, new ArrayList<>());
        adjacentVertices.put(nF, new ArrayList<>());
        graph.setAdjacentNodes(adjacentVertices);
        System.out.println("Is there a route? " + c41.isThereARoute(graph, nA, nB));
        System.out.println("Is there a route? " + c41.isThereARoute(graph, nA, nC));
        System.out.println("Is there a route? " + c41.isThereARoute(graph, nA, nD));
        System.out.println("Is there a route? " + c41.isThereARoute(graph, nA, nE));
        System.out.println("Is there a route? " + c41.isThereARoute(graph, nA, nF));
        System.out.println("Is there a route? " + c41.isThereARoute(graph, nB, nC));
    }

    void testTraversals() {
        //TestTrees.printRegularTree();
        BinaryTreeNode perfectBST = TestBinaryTrees.getPerfectBinarySearchTree();
        //System.out.println("Perfect Binary Search Tree: " + perfectBST);
        System.out.println("\nBST In-Order Traversal");
        TestBinaryTrees.inOrderTraversal(perfectBST);
        System.out.println("\nBST Pre-Order Traversal");
        TestBinaryTrees.preOrderTraversal(perfectBST);
        System.out.println("\nBST Post-Order Traversal");
        TestBinaryTrees.postOrderTraversal(perfectBST);
    }
}

