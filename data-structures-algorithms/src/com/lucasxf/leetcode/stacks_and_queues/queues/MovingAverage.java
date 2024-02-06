package com.lucasxf.leetcode.stacks_and_queues.queues;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private Queue<Integer> window;
    private int size;

    public MovingAverage(int size) {
        window = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        window.offer(val);
        while (!window.isEmpty() && window.size() > size) {
            window.poll();
        }
        double result = 0;
        for (int i : window) {
            result += i;
        }
        return result / window.size();
    }

}
