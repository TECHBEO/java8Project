package com.techbeo.collections.tree;


public class TreeLink {
    private int nodeFrom, nodeTo;

    public TreeLink(int nodeFrom, int nodeTo) {
        this.nodeFrom = nodeFrom;
        this.nodeTo = nodeTo;
    }

    public int getNodeFrom() {
        return nodeFrom;
    }

    public int getNodeTo() {
        return nodeTo;
    }

}

