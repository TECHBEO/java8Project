package com.techbeo;

import java.util.ArrayList;
import java.util.List;
public class ParametricPolymorphism<T> {

    private List<T> itemList = new ArrayList();

    public void add(T item) {
        itemList.add(item);
    }

    public T get(int index) {
        return itemList.get(index);
    }

    public static void main(String args[]) {
        ParametricPolymorphism<String> papersStr = new ParametricPolymorphism();
        papersStr.add("Lion");
        String str = papersStr.get(0);
        System.out.println(str);

        ParametricPolymorphism<Integer> papersInt = new ParametricPolymorphism();
        papersInt.add(new Integer(100));
        Integer integerObj = papersInt.get(0);
        System.out.println(integerObj);
    }
}
