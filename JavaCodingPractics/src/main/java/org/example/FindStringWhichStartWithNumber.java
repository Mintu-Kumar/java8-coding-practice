package org.example;

import java.util.Arrays;
import java.util.List;

public class FindStringWhichStartWithNumber {

    /**
     * Given a list of strings, find out those strings which start with a number?
     * @param args
     */
    public static void main(String[] args){

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream().filter(word->Character.isDigit(word.charAt(0))).forEach(System.out::println);
    }
}
