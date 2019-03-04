package com.homework3.datastructs.stack;

import com.homework3.datastructs.linkedlist.LinkedList;

public class StackLinkedList<T> implements Stack<T> {

    private LinkedList<T> stackList;

    public StackLinkedList() {
        this.stackList = new LinkedList<T>();
    }

    @Override
    public void add(T data) {
        this.stackList.addFirst(data);
    }

    @Override
    public T remove() {
        return this.stackList.removeFirst();
    }

    @Override
    public T peek() {
        return this.stackList.getFirst();
    }

    @Override
    public int getSize() {
        return this.stackList.size();
    }
}
