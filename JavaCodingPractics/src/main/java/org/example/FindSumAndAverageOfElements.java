package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSumAndAverageOfElements {

    public static void main(String[] args){
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};


        int sum = Arrays.stream(a).sum();
        double avg = Arrays.stream(a).average().getAsDouble();
        System.out.println("Sum ="+sum);
        System.out.println("Avg ="+avg);

    }
}
