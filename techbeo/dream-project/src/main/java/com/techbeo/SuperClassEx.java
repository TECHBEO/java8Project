package com.techbeo;

public class SuperClassEx {

    public static void main(String... args) {
        String str = new String("Hi");
        Class strClass = str.getClass();
        System.out.println("______________________________________String___________________________");
        System.out.println("Super class of String: " + strClass.getSuperclass());
        System.out.println("getGenericSuperclass class of String: " + strClass.getGenericSuperclass());
        System.out.println("getCanonicalName class of String: " + strClass.getCanonicalName());
        System.out.println("______________________________________Object___________________________");
        Object obj = new Object();
        Class objClass = obj.getClass();
        System.out.println("Super class of Object: " + objClass.getSuperclass());
        System.out.println("getGenericSuperclass class of Object: " + objClass.getGenericSuperclass());
        System.out.println("getCanonicalName class of Object: " + objClass.getCanonicalName());

        Class classClass = objClass.getClass();
        System.out.println("______________________________________Class___________________________");
        System.out.println("Super class of Class: " + classClass.getSuperclass());
        System.out.println("getGenericSuperclass class of Class: " + classClass.getGenericSuperclass());
        System.out.println("getCanonicalName class of Class: " + classClass.getCanonicalName());
    }
}