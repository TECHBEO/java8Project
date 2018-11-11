package com.techbeo.collections.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner scanner = null;
        try {
            File file = new File("/Users/devbratanand/IdeaProjects/TestEE/resource/treevisInput1.txt");
            scanner = new Scanner(file);

        } catch (FileNotFoundException fnfe) {

        }

        int noOfNode = scanner.nextInt();
        int[] nodeValues = new int[noOfNode] ;
        int[] nodeColor = new int[noOfNode] ;
        Map nodeDepthMap ;

        List<TreeLink> treeLinkList = new ArrayList<TreeLink>();

        for (int i =0 ; i< noOfNode; i++) {
            nodeValues[i] = scanner.nextInt();
        }
        for (int i =0 ; i< noOfNode; i++) {
            nodeColor[i] = scanner.nextInt();
        }
        while (scanner.hasNextInt()) {
            TreeLink treeLink = new TreeLink(scanner.nextInt(), scanner.nextInt());
            treeLinkList.add(treeLink);
        }
        String a = "saaa";

       // treeLinkList.sort(new TreeLinkComparator());
        nodeDepthMap = calculateNodeDepth( treeLinkList);
        System.out.println(nodeDepthMap);
        return null;
    }

    private static Map calculateNodeDepth(List<TreeLink> treeLinkSet) {
        Map nodeDepthMap = new HashMap();
        nodeDepthMap.put(1,0);
        for (TreeLink treeLink : treeLinkSet) {
            if(nodeDepthMap.containsKey(treeLink.getNodeFrom())) {
                nodeDepthMap.put(treeLink.getNodeTo(), (Integer)nodeDepthMap.get(treeLink.getNodeFrom()) + 1);
            }
        }
        return nodeDepthMap;
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        /*root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);*/
    }
}



