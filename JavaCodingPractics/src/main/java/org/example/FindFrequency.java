package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency
{

    /**
     *  Find frequency of character in the given string
     * @param args
     */
    public static void main(String []arg){

        String inputString = "java concept of the day";
        Map<Character,Long> map =  inputString.chars()
                                           .mapToObj(c->(char)c)
                                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }

    /*public static void main(String[] args){
        String inputString = "java concept of the day".replaceAll("\\s+"," ").toLowerCase();
        Map<String,Long> lt =  Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(lt);

    }*/

    /**  4147524383804627
     *  Find frequency of each element in an array or a list?
     * @param args
     */
    /*public static void main(String[] args){
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> map = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }*/
}
