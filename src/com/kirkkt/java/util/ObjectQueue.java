package com.kirkkt.java.util;

public class ObjectQueue<T> implements IObjectQueue<T> {
    private T[] queue;
    private int n;
    private int head;
    private int tail;

    public ObjectQueue(int size) {
        n = size;
        head = tail = 0;
        queue = new T[n];
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
    public boolean enqueue(T item) {
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
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is already empty!");
        }
        T result = queue[head++];
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
        System.out.print("[ ");
        int i = head;
        while (i != tail) {
            System.out.print(queue[i++]);
            if (i >= n) {
                i -= n;
            }
        }
        System.out.println(" ]");
    }
}
