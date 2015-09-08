package com.kirkkt.util;

class IntStack implements IIntStack {
    private int[] s;
    private int n;
    private int size;
    private static final int DEFAULT_SIZE = 9999;
    public IntStack() {
        this(DEFAULT_SIZE);
    }

    public IntStack(int size) {
        this.size = size;
        s = new int[size];
        n = 0;
    }

    @Override
    public boolean push(int item) {
        if (n < size) {
            s[n++] = item;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        return s[--n];
    }

    @Override
    public boolean isEmpty() {
    }
}
