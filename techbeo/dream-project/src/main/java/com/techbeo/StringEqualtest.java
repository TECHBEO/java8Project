package com.techbeo;

public class StringEqualtest {
    public static void main(String[] args) {

        String str1 = new String("ABCD");
        String str2 = new String("ABCD");
        System.out.println("I.->");
        if (str1 == str2) {
            System.out.println("String 1 == String 2 is true");
        } else {
            System.out.println("String 1 == String 2 is false");
        }
        System.out.println("II.->");
        String str3 = str2;
        if (str2 == str3)
        {
            System.out.println("String 2 -> " + str2 + "== String 3 ->" + str3 +" is true ");
        } else {
            System.out.println("String 2 == String 3 is false");
        }
        System.out.println("III.-> ");
        if (str1.equals(str2)) {
            System.out.println("String 1 equals string 2 is true");
        } else {
            System.out.println("String 1 equals string 2 is false");
        }
    }
}