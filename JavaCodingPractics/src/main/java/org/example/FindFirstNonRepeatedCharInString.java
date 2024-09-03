package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharInString {

    public static void main(String[] args){
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Map<String,Long> charCount = Arrays.stream(inputString.split(""))
                                            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String st = charCount.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
        System.out.println(charCount);
    }
}









