package com.kirkkt.java.util;

public class IntQueue implements IIntQueue {
    private int[] queue;
    private int n;
    private int head;
    private int tail;

    public IntQueue(int size) {
        n = size;
        head = tail = 0;
        queue = new int[n];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return size() == n - 1;
    }

    @Override
    public boolean enqueue(int item) {
        if (isFull()) {
            return false;
        }
        queue[tail++] = item;
        if (tail >= n) {
            tail -= n;
        }
        return true;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is already empty!");
        }
        int result = queue[head++];
        if (head >= n) {
            head -= n;
        }
        return result;
    }

    private int size() {
        if (head <= tail) {
            return tail - head;
        }
        return tail - head + n;
    }

    @Override
    public String toString() {
        String result = "[ ";
        int i = head;
        while (i != tail) {
            result += queue[i++];
            result += " ";
            if (i >= n) {
                i -= n;
            }
        }
        result += " ]\n";
        return result;
    }
}
