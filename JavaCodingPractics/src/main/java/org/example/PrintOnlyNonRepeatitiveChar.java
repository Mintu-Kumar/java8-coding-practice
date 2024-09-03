package org.example;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintOnlyNonRepeatitiveChar {

    public static void main(String []args){

        /**
         * Write a Java program for printing all of the unique characters present in a String. For instance,
         * for the string "pppdaf", print characters 'd', 'a', and 'f' since they are unique. The character 'p' is
         * coming thrice in the program. Hence, it is not printed. It is given only small letters are present
         * in the input string.
         */
         String str = "pppdaf";
         Map<Character,Long> map =  str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         map.entrySet().stream().filter(entry->entry.getValue()==1).forEach(entry->System.out.println(entry.getKey()+"-"+entry.getValue()));


        /**
         * A string is given. Our task is to write a Java program to toggle the characters of the given string.
         * For example, for the string "jaVaTpoiNt", the string after the toggle will be "JAvAtPOInT".
         */
        /*String str = "jaVaTpoiNt";
        str.chars().mapToObj(c->(char)c)
                        .map(c->Character.isLowerCase(c) ? Character.toUpperCase(c):Character.isUpperCase(c)?Character.toLowerCase(c):'0').forEach(System.out::println);
        */
    }
}
