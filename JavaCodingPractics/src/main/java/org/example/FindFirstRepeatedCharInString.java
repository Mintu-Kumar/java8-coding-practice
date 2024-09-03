package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedCharInString {

    /**
     * Find first repeated character in a string?
     */

    public static void main(String[] args){
        String inputString = "Java Concept Of The Day".replaceAll("\\s+","").toLowerCase();

        Map<String,Long> charCount =  Arrays.stream(inputString.split(""))
                                            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        String st = charCount.entrySet().stream().filter(c->c.getValue()>1)
                .map(v->v.getKey()).findFirst().get();
        System.out.println(st);
    }
}
