package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {

    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicateElement = listOfIntegers.stream().filter(i->!unique.add(i)).collect(Collectors.toSet());
        //System.out.println(listOfIntegers.stream().distinct().collect(Collectors.toList()));
        System.out.println(duplicateElement);
    }
}
