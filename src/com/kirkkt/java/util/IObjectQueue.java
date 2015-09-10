package com.kirkkt.java.util;

public interface IObjectQueue<T> {
    public boolean isEmpty();
    public boolean isFull();
    public boolean enqueue(T item);
    public T dequeue();
}
