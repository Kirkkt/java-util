package com.kirkkt.java.util;

public class IntDag implements IIntDag {
    private int[] nodes;
    private int[][] outEdges;
    private int[] e;
    private int n;

    public IntDag(int n) {
        this.n = n;
        nodes = new int[n];
        e = new int[n];
        outEdges = new int[n][n - 1];
        for (int i = 0; i < n; i++) {
            e[i] = 0;
        }
    }

    @Override
    public void addEdge(int from, int to) {
        outEdges[from][e[from]++] = to;
    }

    @Override
    public int[] getConnectedNodes(int from) {
        int[] result = new int[e[from]];
        for (int i = 0; i < e[from]; i++) {
            result[i] = outEdges[from][i];
        }
        return result;
    }
}

