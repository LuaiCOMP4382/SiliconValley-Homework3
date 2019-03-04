package com.homework3.datastructs.stack;

public interface Stack<T> {

    void add(T data);
    T remove();
    T peek();
    int getSize();

}
