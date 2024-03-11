package com.lucasxf.cracking_coding_interview;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.AdjacencyListGraph;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.Node;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions.C41_RouteBetweenNodes;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.BinaryTreeNode;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.TestBinaryTrees;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.trees.TestTrees;

import java.util.*;

import static java.util.Arrays.asList;

public class MainCTCI {

    public static void main(String[] args) {
        MainCTCI main = new MainCTCI();
        main.testC41();
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
        graph.setAdjacentVertices(adjacentVertices);
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

