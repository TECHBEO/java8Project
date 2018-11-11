package com.techbeo.collections.tree;

public class BTreeNode {

    BTreeNode lnode;
    BTreeNode rnode;


    int value;

    public BTreeNode(int value) {
        this.value = value;
    }

    public BTreeNode getLnode() {
        return lnode;
    }

    public void setLnode(BTreeNode lnode) {
        this.lnode = lnode;
    }

    public int getValue() {
        return value;
    }

    public BTreeNode getRnode() {

        return rnode;
    }

    public void setRnode(BTreeNode rnode) {
        this.rnode = rnode;
    }
}