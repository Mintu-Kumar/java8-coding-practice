package org.example;

import java.util.stream.IntStream;

public class FindSumOfFirstTenNaturalNumber {

    public static void main(String[] args){

        int sum = IntStream.range(1,11).sum();
        System.out.println(sum);
    }
}
