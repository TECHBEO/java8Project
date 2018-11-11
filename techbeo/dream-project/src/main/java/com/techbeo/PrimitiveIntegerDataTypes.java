package com.techbeo;

import java.util.Scanner;

public class PrimitiveIntegerDataTypes {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();

        for(int i=0; i<t && sc.hasNext();i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                long byteRange = (long) Math.pow(2,7);
                long shortRange = (long) Math.pow(2,15);
                long intRange = (long) Math.pow(2,31);
                long longRange = (long) Math.pow(2,63);
                if(x >= -byteRange && x <= byteRange-1) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(x>=-shortRange && x<=shortRange-1) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if (x>=-intRange && x<=intRange-1) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=-longRange-1 && x<=longRange) {
                    System.out.println("* long");
                } else {
                    System.out.println(x + " can't be fitted anywhere.");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}