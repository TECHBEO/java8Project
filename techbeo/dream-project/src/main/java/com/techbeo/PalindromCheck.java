package com.techbeo;

import java.util.Scanner;

public class PalindromCheck {
    public static boolean isPalindrome(String word) {

        char[] charArr = word.toLowerCase().toCharArray();
        int midPoint = word.length()/2;
        for(int i=0; i < midPoint; i++) {
            if(charArr[word.length()-1-i] != charArr[i]) {
                return false ;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(PalindromCheck.isPalindrome("Deleveled"));
    }
}