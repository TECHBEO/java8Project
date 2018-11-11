package com.techbeo;

 class Base {
     private static void displayPrivateStatic() {
         System.out.println("displayPrivateStatic or class method from Base");
     }

     static void displayStatic() {
         System.out.println("displayStatic or class method from Base");
     }

     private void displayPrivate() {
         System.out.println("displayPrivate or class method from Base");
     }

     public void print() {
         System.out.println("Non-static or instance method from Base");
     }
 }
 class Derived extends Base {

     private static void displayPrivateStatic() {
         System.out.println("displayPrivateStatic or class method from Derived");
     }

     static void displayStatic() {
         System.out.println("displayStatic or class method from Derived");
     }

     private void displayPrivate() {
         System.out.println("displayPrivate or class method from Derived");
     }

     public void print() {
         System.out.println("Non-static or instance method from Derived");
     }
 }
public class PrivateStaticOverrideEx {
    public static void main(String args[])
    {
            Base obj= new Derived();

            obj.displayStatic();

            obj.print();
    }
}