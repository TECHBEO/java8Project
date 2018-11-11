package com.techbeo.collections.array;

import com.techbeo.MathUtil;

public class ArrayUtil {

    //Reversing the given array

    /**
     * Time complexity : O(n/2)
     * Auxiliary Space : O(1)
     * @param input the {link @Object[]}
     */
    public static void reverseArray(Object[] input ) {

        int arrayMaxIndex = input.length - 1;
        for (int i =0 ; i < input.length /2 ; i++) {
            Object temp = input[i];
            input[i] = input[arrayMaxIndex - i] ;
            input[arrayMaxIndex - i] = temp;
        }
    }

    /**
     * Time complexity : O(n)
     * Auxiliary Space : O(n)
     * @param inputArray
     * @param numOfRotaion
     * @param arraySize
     */
    public static Object[] rotateLeftTimeOptimized(Object[] inputArray, int numOfRotaion, int arraySize) {

        if(arraySize < 2) {
            return inputArray;
        }

        if(numOfRotaion > arraySize) {
            numOfRotaion = numOfRotaion - arraySize * (numOfRotaion/arraySize) ;
        }
        Object[] outputArray = new Object[arraySize];
        int i =0;
        for (;i < numOfRotaion; i++) {
            outputArray[i] = inputArray[arraySize - numOfRotaion + i];
        }

        for (int j =0; i < arraySize; i++, j++) {
            outputArray[i] = inputArray[j];
        }
        return outputArray;
    }

    /**
     * Time complexity : O(n)
     * Auxiliary Space : O(d)
     * @param inputArray
     * @param numOfRotaion
     * @param arraySize
     */
    public static void rotateLeftSpaceOptimized(Object[] inputArray, int numOfRotaion, int arraySize) {

        if(arraySize < 2) {
            return;
        }

        if(numOfRotaion > arraySize) {
            numOfRotaion = numOfRotaion - arraySize * (numOfRotaion/arraySize) ;
        }

        if(numOfRotaion <= 0) {
            throw new IllegalArgumentException("No of rotation should be a natural number greater than zero i.e. a n > 0 ");
        }

        Object[] tempArray = new Object[numOfRotaion];

        for (int i = 0;i < numOfRotaion; i++) {
            tempArray[i] = inputArray[arraySize - numOfRotaion + i];

        }

        for (int j =arraySize-1; j >= numOfRotaion; j--) {
            inputArray[j] = inputArray[j-numOfRotaion];
        }

        for (int j =0; j < tempArray.length; j++) {
            inputArray[j] = tempArray[j] ;

        }
    }

    /**
     * Time complexity : O(n*1)
     * Auxiliary Space : O(1)
     * @param inputArray
     */
    public static void leftRotateByOne(Object[] inputArray) {
        if(inputArray.length < 2) {
            return;
        }

        Object temp = inputArray[inputArray.length-1];
        for (int i = 0; i < inputArray.length-1; i++) {
            inputArray[inputArray.length-i-1] = inputArray[inputArray.length-i-2];

        }
        inputArray[0] = temp;
    }

    /**
     * Time complexity : O(n*d)
     * Auxiliary Space : O(1)
     * @param inputArray
     */
    public static void leftRotateWithSingleAuxSpace(Object[] inputArray, int rotaionNumber) {

        if(rotaionNumber <= 0) {
            throw new IllegalArgumentException("No of rotation should be a natural number greater than zero i.e. a n > 0 ");
        }
        int arraySize = inputArray.length;

        if(arraySize < 2) {
            return;
        }
        if(rotaionNumber > arraySize) {
            rotaionNumber = rotaionNumber - arraySize * (rotaionNumber/arraySize) ;
        }

        for (int i = 0; i < rotaionNumber ; i++) {
            leftRotateByOne(inputArray);
        }
    }

    /**
     * Time complexity : O(n)
     * Auxiliary Space : O(1)
     * @param inputArray
     */
    public static void leftRotateTimeOptimizedWithSingleAuxSpace(Object[] inputArray, int rotaionNumber) {

        if(rotaionNumber <= 0) {
            throw new IllegalArgumentException("No of rotation should be a natural number greater than zero i.e. a n > 0 ");
        }
        int arraySize = inputArray.length;

        if(arraySize < 2) {
            return;
        }
        if(rotaionNumber > arraySize) {
            rotaionNumber = rotaionNumber - arraySize * (rotaionNumber/arraySize) ;
        }
        int gcd = MathUtil.calculateGCD(rotaionNumber, arraySize);

        int numberOfSubSet = arraySize/gcd ;

        System.out.println(" gcd-> " +  gcd + "  & NoOfSubSet - " + numberOfSubSet );
        int k = 0;
        for (int j = 0; j < gcd  ; j++) {
            Object temp = inputArray[gcd * (numberOfSubSet  -1) + j];
            for (int i = numberOfSubSet-1; i >= 0  ; i--) {

                if(i == 0) {
                    inputArray[i * gcd + j ] = temp;
                }
                else {
                    inputArray[i * gcd + j ] = inputArray[(i-1) * gcd + j];
                }

            }
            System.out.println(" no if iteration j -> " + j);
            printArray(inputArray);
        }

    }

    /*Function to left rotate arr[] of siz n by d*/
    public static void leftRotate(Object arr[], int d)
    {
        int i, j, k;
        Object temp;
        int n = arr.length;
        for (i = 0; i < MathUtil.calculateGCD(d, n); i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static void printArray(Object[] inputArray) {
        for (Object element : inputArray) {
            System.out.print(element + ", ");
        }
        System.out.println("");
    }



}