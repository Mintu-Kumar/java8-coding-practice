package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindThreeMaxNumber {

    public static void main(String[] args){

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> threeMax = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        List<Integer> threeMin = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(threeMin);
        System.out.println(threeMax);

    }
}
