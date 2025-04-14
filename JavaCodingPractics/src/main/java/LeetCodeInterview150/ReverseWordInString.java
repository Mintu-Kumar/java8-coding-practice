package LeetCodeInterview150;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordInString {

    public static String reverseWords(String s) {
        return Arrays.stream(s.trim().split("\\s+")) // Split by spaces and remove extra spaces
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list); // Reverse the list
                    return String.join(" ", list); // Join back into a string
                }));
    }

    public static void main(String[] args){
        String s = "the sky is blue";
        String result = reverseWords(s);
        System.out.println("Reversed Words: " + result);
    }
}
