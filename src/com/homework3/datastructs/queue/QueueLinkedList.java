package com.homework3.datastructs.queue;

import com.homework3.datastructs.linkedlist.LinkedList;

public class QueueLinkedList<T> implements Queue<T> {

    private LinkedList<T> queueList;

    public QueueLinkedList() {
        this.queueList = new LinkedList<T>();
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
