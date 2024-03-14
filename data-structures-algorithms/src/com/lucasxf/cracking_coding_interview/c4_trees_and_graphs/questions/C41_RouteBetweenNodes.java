package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.questions;

import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.AdjacencyListGraph;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.Node;
import com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs.NodeState;

import java.util.*;

/**
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
 */
public class C41_RouteBetweenNodes {

    public boolean isThereARoute(AdjacencyListGraph adjacencyListGraph, Node x, Node y) {
        if (adjacencyListGraph == null || x == null || y == null) {
            return false;
        }
        if (x.equals(y)) {
            return true;
        }
        final Map<Node, List<Node>> graph = adjacencyListGraph.getAdjacentNodes();
        if (!graph.containsKey(x) || !graph.containsKey(y)) {
            return false;
        }
        return search(adjacencyListGraph, x, y);
    }

    boolean search(AdjacencyListGraph adjacencyListGraph, Node x, Node y) {
        Queue<Node> queue = new ArrayDeque<>();
        Map<Node, List<Node>> graph = adjacencyListGraph.getAdjacentNodes();
        queue.offer(x);
        x.setState(NodeState.VISITING);
        for (Node n : graph.keySet()) {
            n.setState(NodeState.UNVISITED);
        }
        while (!queue.isEmpty()) {
            Node curr = queue.remove();
            if (curr.equals(y)) {
                return true;
            }
            List<Node> adjNodes = graph.get(curr);
            for (Node adj : adjNodes) {
                if (adj.getState() == NodeState.UNVISITED) {
                    queue.offer(adj);
                    adj.setState(NodeState.VISITING);
                }
            }
            curr.setState(NodeState.VISITED);
        }
        return false;
    }

}
