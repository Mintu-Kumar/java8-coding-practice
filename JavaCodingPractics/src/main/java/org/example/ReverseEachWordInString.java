package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {

    public static void main(String[] args){
        String str = "Java Concept Of The Day";
        String reversString = Stream.of(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversString);
    }
}
