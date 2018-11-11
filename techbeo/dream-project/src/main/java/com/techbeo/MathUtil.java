package com.techbeo;

public class MathUtil {


    /**
     *
     * @param a
     * @param b
     * @return greatest common divisor for the given two number
     */
    public static int calculateGCD(int a, int b) {

        if(a <0 || b < 0) {
            throw  new IllegalArgumentException("GCD could not be calculated for neative number.");
        }
        if(b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}