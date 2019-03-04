package com.homework3.datastructs.linkedlist;

public class LinkedList<T> {

    class LinkedListNode<T> {

        private T data;
        LinkedListNode<T> next;

        LinkedListNode(T data) {
            this.data = data;
        }

        T getData() {
            return data;
        }

        void setData(T data) {
            this.data = data;
        }
    }

    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;
    private int size = 0;

    public void addFirst(T data) {
        LinkedListNode<T> node = new LinkedListNode<T>(data);

        if (this.head == null){
            this.head = node;
            this.tail = this.head;
        } else {
            node.next = this.head;
            this.head = node;
        }

        this.size++;
    }

    public void addLast(T data){
        LinkedListNode<T> node = new LinkedListNode<T>(data);

        if (this.tail == null){
            this.tail = node;
            this.head = this.tail;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }

    public T removeFirst(){
        if (this.size == 0)
            return null;

        T headData = this.head.getData();

        this.head = this.head.next;
        this.size--;

        return headData;
    }

    public T removeLast() {
        if (this.size == 0)
            return null;

        T tailData = this.tail.getData();

        LinkedListNode<T> currentNode = this.head;
        while (currentNode.next != this.tail)
            currentNode = currentNode.next;

        this.tail = currentNode;
        this.tail.next = null;

        this.size--;

        return tailData;
    }

    public T get(int index) {

        if (index < 0 || index >= this.size)
            throw new IndexOutOfBoundsException();

        LinkedListNode<T> currentNode = this.head;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;

        return currentNode.getData();
    }

    public T getFirst() {

        if (this.size == 0)
            return null;

        return head.getData();
    }

    public T getLast() {

        if (this.size == 0)
            return null;

        return tail.getData();
    }

    @Override
    public String toString() {
        LinkedListNode<T> currentNode = this.head;
        StringBuilder outputBuilder = new StringBuilder();

        while (currentNode != null) {
            if (currentNode == head)
                outputBuilder.append("[").append(currentNode.getData().toString());
            else
                outputBuilder.append(", ").append(currentNode.getData().toString());

            if (currentNode == tail)
                outputBuilder.append("]");

            currentNode = currentNode.next;
        }

        return outputBuilder.toString();
    }

    public int size() {
        return size;
    }

}
