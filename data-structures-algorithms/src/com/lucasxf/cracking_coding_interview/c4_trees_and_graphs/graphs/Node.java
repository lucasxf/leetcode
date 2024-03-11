package com.lucasxf.cracking_coding_interview.c4_trees_and_graphs.graphs;

import java.util.Objects;

public class Node implements Vertex {

    private int data;
    private String label;
    private boolean isVisited;

    public Node() {
    }

    public Node(String label) {
        this.label = label;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(label, node.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", label='" + label + '\'' +
                ", isVisited=" + isVisited +
                '}';
    }

}
