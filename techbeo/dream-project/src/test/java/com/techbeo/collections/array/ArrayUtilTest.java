package com.techbeo.collections.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayUtilTest {


    @DisplayName("Verify Array Reverse Api API for Odd array size like {6,5,4,3,2,1,0}")
    @Test
    public void testArrayReverseApiOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{0, 1, 2, 3, 4, 5, 6};

        //When
        ArrayUtil.reverseArray(givenArray);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify Array Reverse Api API for even array size like {5,4,3,2,1,0}")
    @Test
    public void testArrayReverseApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{0, 1, 2, 3, 4, 5};
        //When
        ArrayUtil.reverseArray(givenArray);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );



        //When
        ArrayUtil.rotateLeftTimeOptimized(givenArray, 2, givenArray.length);

    }

    @DisplayName("Verify Array Reverse Api API for empty array { }")
    @Test
    public void testArrayReverseApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        ArrayUtil.reverseArray(givenArray);
    }

    @DisplayName("Verify Array Reverse Api API for array with single element {100 }")
    @Test
    public void testArrayReverseApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
        ArrayUtil.reverseArray(givenArray);

    }

    @DisplayName("Verify ArrayRotateApi API for Odd array size like {6,5,4,3,2,1,0}")
    @Test
    public void testArrayRotateApiOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{  2, 1, 0, 6, 5, 4, 3};;

        //When
        givenArray = ArrayUtil.rotateLeftTimeOptimized(givenArray, 3, givenArray.length);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotate API for even array size like {5,4,3,2,1,0}")
    @Test
    public void testArrayRotateApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{ 1, 0, 5, 4, 3, 2};

        //When
        givenArray = ArrayUtil.rotateLeftTimeOptimized(givenArray, 2, givenArray.length);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotate  API for empty array { }")
    @Test
    public void testArrayRotateApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        givenArray = ArrayUtil.rotateLeftTimeOptimized(givenArray, 2, givenArray.length);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    @DisplayName("Verify ArrayRotate API for array with single element {100 }")
    @Test
    public void testArrayRotateApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
        givenArray = ArrayUtil.rotateLeftTimeOptimized(givenArray, 2, givenArray.length);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    //Rotate array with space optimization : -

    @DisplayName("Verify ArrayRotateSpaceOptimizedApi API for Odd array size like {6,5,4,3,2,1,0}")
    @Test
    public void testArrayRotateSpaceOptimizedApiOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{2, 1, 0, 6, 5, 4, 3};;

        //When
        ArrayUtil.rotateLeftSpaceOptimized(givenArray, 3, givenArray.length);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateSpaceOptimizedApi API for even array size like {5,4,3,2,1,0}")
    @Test
    public void testArrayRotateSpaceOptimizedApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{ 1, 0, 5, 4, 3, 2};

        //When
        ArrayUtil.rotateLeftSpaceOptimized(givenArray, 2, givenArray.length);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateSpaceOptimizedApi API for empty array { }")
    @Test
    public void testArrayRotateSpaceOptimizedApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        ArrayUtil.rotateLeftSpaceOptimized(givenArray, 2, givenArray.length);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    @DisplayName("Verify ArrayRotateSpaceOptimizedApi API for array with single element {100 }")
    @Test
    public void testArrayRotateSpaceOptimizedApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
         ArrayUtil.rotateLeftSpaceOptimized(givenArray, 2, givenArray.length);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    //Rotate array left single time  : -

    @DisplayName("Verify ArrayRotateOneTimeApi API for Odd array size like {6,5,4,3,2,1,0}")
    @Test
    public void testArrayRotateOneTimeApiOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{0, 6, 5, 4, 3, 2, 1};

        //When
        ArrayUtil.leftRotateByOne(givenArray);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateOneTimeApi API for even array size like {5,4,3,2,1,0}")
    @Test
    public void testArrayRotateOneTimeApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{ 0, 5, 4, 3, 2, 1};

        //When
        ArrayUtil.leftRotateByOne(givenArray);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateOneTimeApi API for empty array { }")
    @Test
    public void testArrayRotateOneTimeApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        ArrayUtil.leftRotateByOne(givenArray);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    @DisplayName("Verify ArrayRotateOneTimeApi API for array with single element {100 }")
    @Test
    public void testArrayRotateOneTimeApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
        ArrayUtil.leftRotateByOne(givenArray);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    //Rotate array left with single space : -

    @DisplayName("Verify ArrayRotateLeftApi API for Odd array size like {6,5,4,3,2,1,0}")
    @Test
    public void testArrayRotateLeftApiOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{2, 1, 0, 6, 5, 4, 3};;

        //When
        ArrayUtil.leftRotateWithSingleAuxSpace(givenArray, 3);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateLeftApi API for even array size like {5,4,3,2,1,0}")
    @Test
    public void testArrayRotateLeftApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{ 1, 0, 5, 4, 3, 2};

        //When
        ArrayUtil.leftRotateWithSingleAuxSpace(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateLeftApi API for empty array { }")
    @Test
    public void testArrayRotateLeftApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        ArrayUtil.leftRotateWithSingleAuxSpace(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    @DisplayName("Verify ArrayRotateLeftApi API for array with single element {100 }")
    @Test
    public void testArrayRotateLeftApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
        ArrayUtil.leftRotateWithSingleAuxSpace(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    //Rotate array left with single space & O(n) time complexity : -

    @DisplayName("Verify ArrayRotateLeftBTSApi API for Odd array size like {6,5,4,3,2,1,0} no Of rotaion - 3")
    @Test
    public void testArrayRotateLeftBTSApiOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{2, 1, 0, 6, 5, 4, 3};;

        //When
        ArrayUtil.leftRotate(givenArray, 3);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateLeftBTSApi API for even array size  {5,4,3,2,1,0} & No of ratation is 2.")
    @Test
    public void testArrayRotateLeftBTSApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{ 1, 0, 5, 4, 3, 2};

        //When
        ArrayUtil.leftRotateTimeOptimizedWithSingleAuxSpace(givenArray, 2);

       // ArrayUtil.printArray(givenArray);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify ArrayRotateLeftBTSApi API for empty array { }")
    @Test
    public void testArrayRotateLeftBTSApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        ArrayUtil.leftRotateTimeOptimizedWithSingleAuxSpace(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    @DisplayName("Verify ArrayRotateLeftBTSApi API for array with single element {100 }")
    @Test
    public void testArrayRotateLeftBTSApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
        ArrayUtil.leftRotateTimeOptimizedWithSingleAuxSpace(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }


//______________________

    //Rotate array left with single space & O(n) time complexity : -

    @DisplayName("Verify leftRotate API for Odd array size like {6,5,4,3,2,1,0} no Of rotaion - 3")
    @Test
    public void testleftRotateOdd(){
        //Given
        Object[]  givenArray = new Object[]{ 6, 5, 4, 3, 2, 1, 0};
        Object[]  expectedArray = new Object[]{2, 1, 0, 6, 5, 4, 3};;

        //When
        ArrayUtil.leftRotate(givenArray, 3);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify leftRotate API for even array size  {5,4,3,2,1,0} & No of ratation is 2.")
    @Test
    public void testArrayLeftRotateApiEven(){
        //Given
        Object[] givenArray = new Object[]{ 5, 4, 3, 2, 1, 0};
        Object[] expectedArray = new Object[]{ 1, 0, 5, 4, 3, 2};

        //When
        ArrayUtil.leftRotate(givenArray, 2);

        // ArrayUtil.printArray(givenArray);
        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );


    }

    @DisplayName("Verify leftRotate API for empty array { }")
    @Test
    public void testrotateLeftBTSApiEmpty(){
        //Given
        Object[] givenArray = new Object[]{ };
        Object[] expectedArray = new Object[]{ };

        //When
        ArrayUtil.leftRotate(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }

    @DisplayName("Verify leftRotate API for array with single element {100 }")
    @Test
    public void testArrayrotateLeftApiSingleElement(){
        //Given
        Object[] givenArray = new Object[]{ 100};
        Object[] expectedArray = new Object[]{100 };

        //When
        ArrayUtil.leftRotate(givenArray, 2);

        //Then
        Assertions.assertArrayEquals( expectedArray, givenArray );

    }







}