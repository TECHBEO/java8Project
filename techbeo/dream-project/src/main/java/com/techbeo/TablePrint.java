package com.techbeo;

import java.util.Scanner;

public class TablePrint {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i=1; i<11; i++) {
            StringBuffer s = new StringBuffer()
                    .append(N)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(N*i) ;

            System.out.println(s) ;
        }

        scanner.close();
    }
}