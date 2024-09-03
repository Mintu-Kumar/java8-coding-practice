package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestInArray {

    public static void main(String[] args){

        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Optional<Integer> secondLargest = listOfInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLargest.get());
    }
}
