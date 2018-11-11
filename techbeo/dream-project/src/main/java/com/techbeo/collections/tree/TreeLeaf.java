package com.techbeo.collections.tree;

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVisitor visitor) {
        visitor.visitLeaf(this);
    }
}