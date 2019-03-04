package com.homework3.datastructs.queue;

import java.util.ArrayDeque;

public class QueueArrayDeque<T> implements Queue<T> {

    private ArrayDeque<T> queueList;

    public QueueArrayDeque(int initialSize) {
        this.queueList = new ArrayDeque<T>(initialSize);
    }

    @Override
    public void enqueue(T data) {
        this.queueList.addLast(data);
    }

    @Override
    public T dequeue() {
        return this.queueList.removeFirst();
    }

    @Override
    public T peek() {
        return this.queueList.getFirst();
    }

    @Override
    public int getSize() {
        return this.queueList.size();
    }
}
