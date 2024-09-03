package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckMultipleFive {

    public static void main(String [] args){
        List<Integer> number = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> multipleFive = number.stream().filter(n->n%5==0).collect(Collectors.toList());
        System.out.println(multipleFive);
    }
}
