package com.techbeo;

import java.util.Scanner;

public class IOTest1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for(int s=0; s < 15-s1.length(); s++) {
                System.out.print(" ");
            }
            if (x < 10) {
                System.out.print("00");
            } else if ( x < 100) {
                System.out.print("0");
            }
            System.out.println(x);
            //sc.skip("//n");
        }
        System.out.println("================================");

    }

}