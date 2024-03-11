package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs;

import java.util.*;

import static java.util.Arrays.asList;

public class AdjacencyListSamples {

    public void directedGraphWithMaps() {
        final Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", asList("b", "c"));
        graph.put("b", asList("a"));
        graph.put("c", asList("e"));
        graph.put("d", new ArrayList<>());
        graph.put("e", asList("b"));
        graph.put("f", asList("d"));
    }
    
}

