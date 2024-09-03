package org.example;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {

    public static void main(String[] args){

        int[] arr =  new int[] {5,1,7,3,9,6};

        int[] reverseArray = IntStream.rangeClosed(1,arr.length).map(i->arr[arr.length-i]).toArray();
        System.out.println(Arrays.toString(reverseArray));
    }
}
