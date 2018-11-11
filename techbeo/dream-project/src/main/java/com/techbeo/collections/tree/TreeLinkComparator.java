package com.techbeo.collections.tree;

import java.util.Comparator;

class TreeLinkComparator implements Comparator<TreeLink> {

   @Override
   public int compare(TreeLink obj1, TreeLink obj2) {
       if(obj1 == null || obj2 ==  null) {
           throw new IllegalArgumentException("There should not be any null arguments.");
       }
       return Integer.compare(obj1.getNodeFrom() , obj2.getNodeFrom());
   }
}