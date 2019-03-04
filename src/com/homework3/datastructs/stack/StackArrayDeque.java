package com.homework3.datastructs.stack;

import java.util.ArrayDeque;

public class StackArrayDeque<T> implements Stack<T> {

    private ArrayDeque<T> stackList;

    public StackArrayDeque(int initialSize) {
        this.stackList = new ArrayDeque<T>(initialSize);
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
