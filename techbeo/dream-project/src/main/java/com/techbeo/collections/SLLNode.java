package com.techbeo.collections;

public class SLLNode<T> {
    T value;

    public SLLNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SLLNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SLLNode nextNode) {
        this.nextNode = nextNode;
    }

    SLLNode nextNode;
}