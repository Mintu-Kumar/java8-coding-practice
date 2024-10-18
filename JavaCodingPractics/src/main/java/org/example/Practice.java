package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String []args)
    {
       // Most repetitive character in a string
        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int i = listOfInteger.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);
        int p =  listOfInteger.stream().max((k,j)->k.compareTo(j)).get();
        System.out.println(p);

       int n =  listOfInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(n);

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> list = listOfStrings.stream().filter(word->Character.isDigit(word.charAt(0))).collect(Collectors.toList());
        System.out.println(list);

    }

}
