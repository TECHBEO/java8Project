package com.techbeo.collections.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTreeImpl {

    BTreeNode [] treeNodes;
    Queue<BTreeNode> tempQue =new LinkedList<BTreeNode>();
    List<Integer> outputList = new ArrayList();


    public  BTreeNode createSampleTree() {

        BTreeNode rootNode = new BTreeNode(1);
        BTreeNode bTreeNode2 = new BTreeNode(2);
        BTreeNode bTreeNode3 = new BTreeNode(3);
        BTreeNode bTreeNode4 = new BTreeNode(4);
        BTreeNode bTreeNode5 = new BTreeNode(5);
        BTreeNode bTreeNode6 = new BTreeNode(6);
        BTreeNode bTreeNode7 = new BTreeNode(7);
        BTreeNode bTreeNode8 = new BTreeNode(8);
        BTreeNode bTreeNode9 = new BTreeNode(9);

        rootNode.setLnode(bTreeNode2);
        rootNode.setRnode(bTreeNode3);
        bTreeNode2.setLnode(bTreeNode4);
        bTreeNode2.setRnode(bTreeNode5);
        bTreeNode4.setLnode(bTreeNode6);
        bTreeNode5.setRnode(bTreeNode7);

        return rootNode;

    }

    public  void traverseBFS(BTreeNode rNode) {
        BTreeNode node = null;
            tempQue.add(rNode);
           do {
               node = tempQue.poll();
               outputList.add(node.getValue());
               if(node.getLnode() != null) {
                   tempQue.add(node.getLnode());
               }
               if(node.getRnode() != null) {
                   tempQue.add(node.getRnode());
               }

            } while (!tempQue.isEmpty());

          System.out.print(outputList);

    }
    public static void main (String args[]) {
        BFSTreeImpl obj  = new BFSTreeImpl();
        obj.traverseBFS( obj.createSampleTree() );
    }

}



