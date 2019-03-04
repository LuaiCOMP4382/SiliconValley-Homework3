package com.homework3.datastructs.queue;

public interface Queue<T> {

    void enqueue(T data);
    T dequeue();
    T peek();
    int getSize();

}
