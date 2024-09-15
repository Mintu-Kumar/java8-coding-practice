package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {

    public static void main(String[] args)
    {
        int[] a = new int[] {4, 2, 5, 1,0,0,0,0};

        int[] b = new int[] {8, 1, 9, 5};

         a = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().skip(4).toArray();
        System.out.println(Arrays.toString(a));
    }
}
