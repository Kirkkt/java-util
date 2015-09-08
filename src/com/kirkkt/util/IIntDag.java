package com.kirkkt.util;

public interface IIntDag {
    public void addEdge(int from, int to);
    public int[] getConnectedNodes(int from);
}

