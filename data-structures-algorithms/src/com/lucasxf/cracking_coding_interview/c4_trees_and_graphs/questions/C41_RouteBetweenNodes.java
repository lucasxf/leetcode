package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.AdjacencyListGraph;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.Node;

import java.util.*;

/**
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
 */
public class C41_RouteBetweenNodes {

    public boolean isThereARoute(AdjacencyListGraph adjacencyListGraph, Node x, Node y) {
        if (adjacencyListGraph == null || x == null || y == null) {
            return false;
        }
        final Map<Node, List<Node>> graph = adjacencyListGraph.getAdjacentVertices();
        if (!graph.containsKey(x) || !graph.containsKey(y)) {
            return false;
        }
        return search(adjacencyListGraph, x, y);
    }

    boolean search(AdjacencyListGraph adjacencyListGraph, Node x, Node y) {
        Queue<Node> nodeQueue = new ArrayDeque<>();
        Map<Node, List<Node>> vertices = adjacencyListGraph.getAdjacentVertices();
        nodeQueue.offer(x);
        while (!nodeQueue.isEmpty()) {
            Node curr = nodeQueue.remove();
            if (curr.equals(y)) {
                return true;
            }
            List<Node> adjNodes = vertices.get(curr);
            for (Node adj : adjNodes) {
                nodeQueue.offer(adj);
            }
        }
        return false;
    }

}
