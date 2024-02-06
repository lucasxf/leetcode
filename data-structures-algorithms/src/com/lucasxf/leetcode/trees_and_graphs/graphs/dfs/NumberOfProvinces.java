package com.lucasxf.leetcode.trees_and_graphs.graphs.dfs;

import java.util.*;

/**
 * There are n cities. Some of them are connected, while some are not.
 * If city a is connected directly with city b, and city b is connected directly with city c,
 * then city a is connected indirectly with city c.
 * <p>
 * A province is a group of directly or indirectly connected cities and no other cities outside the group.
 * <p>
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city
 * are directly connected, and isConnected[i][j] = 0 otherwise.
 * <p>
 * Return the total number of provinces.
 */
public class NumberOfProvinces {

    // fail
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null) {
            return 0;
        }
        int n = isConnected.length;
        final Map<Integer, List<Integer>> graph = provincyGraph(isConnected);
        for (Integer city : graph.keySet()) {
            final List<Integer> connections = graph.get(city);
        }
        return n;
    }

    private Map<Integer, List<Integer>> provincyGraph(int[][] edges) {
        final Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int[] city = edges[i];
            final List<Integer> connections = new ArrayList<>();
            for (int j = 0; j < city.length; j++) {
                connections.add(city[j]);
                int connection = city[j];
                //if (connection == 1 )
            }
            graph.put(i, connections);
        }
        return graph;
    }

    // solution
    class Solution {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] seen;

        public int findCircleNum(int[][] isConnected) {
            // build the graph
            int n = isConnected.length;
            for (int i = 0; i < n; i++) {
                if (!graph.containsKey(i)) {
                    graph.put(i, new ArrayList<>());
                }
                for (int j = i + 1; j < n; j++) {
                    if (!graph.containsKey(j)) {
                        graph.put(j, new ArrayList<>());
                    }
                    if (isConnected[i][j] == 1) {
                        graph.get(i).add(j);
                        graph.get(j).add(i);
                    }
                }
            }

            seen = new boolean[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (!seen[i]) {
                    // add all nodes of a connected component to the set
                    ans++;
                    seen[i] = true;
                    dfs(i);
                }
            }

            return ans;
        }

        public void dfs(int node) {
            for (int neighbor : graph.get(node)) {
                if (!seen[neighbor]) {
                    seen[neighbor] = true;
                    dfs(neighbor);
                }
            }
        }
    }

}
