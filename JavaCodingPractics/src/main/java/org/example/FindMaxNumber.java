package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber{

    public static void main(String[] args){
        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        /**
         * To find minimum replace max to min
         */
        System.out.println(listOfInteger.stream().max(Comparator.naturalOrder()).get());
        Optional<Integer> num = listOfInteger.stream().max((i, j)->i.compareTo(j));
        System.out.println(num.get());
        System.out.println(listOfInteger.stream().sorted(Comparator.reverseOrder()).findFirst().get());
    }
}
