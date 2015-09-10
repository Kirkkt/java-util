package com.kirkkt.java.util;

public interface IIntQueue {
    public boolean isEmpty();
    public boolean isFull();
    public boolean enqueue(int item);
    public int dequeue();
}
