package com.techbeo.collections.tree;

abstract class TreeVisitor
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}