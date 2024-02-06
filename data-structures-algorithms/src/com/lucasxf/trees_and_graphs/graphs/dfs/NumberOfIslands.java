package com.lucasxf.trees_and_graphs.graphs.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        final Map<Integer, List<Character>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
            for (int j = i + 1; j < n; j++) {
                if (!graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                int geo = grid[i][j];
            }
        }
        return 0;
    }

    private void dfs() {

    }
}
