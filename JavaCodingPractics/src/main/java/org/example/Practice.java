package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String []args)
    {
       // Most repetitive character in a string
        String inputString = "Java concept of the day";
               Map<Character,Long> map =  inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }

}
