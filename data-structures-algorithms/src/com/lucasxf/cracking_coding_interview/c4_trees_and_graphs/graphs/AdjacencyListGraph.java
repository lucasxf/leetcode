package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyListGraph implements Graph {

    private Map<Node, List<Node>> adjacentNodes = new HashMap<>();

    public Map<Node, List<Node>> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, List<Node>> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    @Override
    public String toString() {
        return "AdjacencyListGraph{" +
                "adjacentVertices=" + adjacentNodes +
                '}';
    }

}
