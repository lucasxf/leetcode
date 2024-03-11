package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyListGraph implements Graph {

    private Map<Node, List<Node>> adjacentVertices = new HashMap<>();

    public Map<Node, List<Node>> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void setAdjacentVertices(Map<Node, List<Node>> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    @Override
    public String toString() {
        return "AdjacencyListGraph{" +
                "adjacentVertices=" + adjacentVertices +
                '}';
    }

}
