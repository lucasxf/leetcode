package com.lucasxf.trees_and_graphs.graphs;

import java.util.*;

public class GraphBuilder {

    public static Map<Integer, List<Integer>> fromIntArray(int[][] edges) {
        if (edges == null) {
            return Collections.emptyMap();
        }
        final Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            if (!graph.containsKey(x)) {
                graph.put(x, new ArrayList<>());
            }
            graph.get(x).add(y);

            // if (!graph.containsKey(y)) {
            //     graph.put(y, new ArrayList<>());
            // }
            // graph.get(y).add(x);

            // uncomment the above lines if the graph is undirected
        }
        return graph;
    }
}
