package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharecter {


    public static void main(String[] args) {
        /*Scanner sc =  new Scanner(System.in);
        System.out.println("Enter string:-");
        String inputString =  sc.nextLine();*/

        /*Find duplicate elements from string*/
        //Map<Character,Long> map =  inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //map.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry-> System.out.println(entry.getKey()+"-"+entry.getValue()));
             //inputString.chars().mapToObj(c->c);

        /* remove white space from string*/
        /*
        String p =  inputString.chars().filter(sp->sp!= ' ').mapToObj(c->(char)c).map(Objects::toString).collect(Collectors.joining());// Collectors.joining()  -  it is used to concatenate the string
        String q =  inputString.chars().mapToObj(c->(char)c).filter(sp->sp!= ' ').map(m->m.toString()).collect(Collectors.joining());
        System.out.println(q);*/

        /* find duplicate element from array*/
        /*int[] arr =  new int[]{2,2,3,4,5,4,5,7};
        Set<Integer> uniqueElement =  new HashSet<>();

        Set<Integer> duplicateElement =  Arrays.stream(arr)
                                            .filter(i->!uniqueElement.add(i))
                                            .boxed()
                                            .collect(Collectors.toSet());
        System.out.println(duplicateElement);*/

        /* Find second largest element fo array*/
/*
        int[] numbers = {10, 5, 8, 20, 15};
        int secondLargest =  Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted((a,b)->Integer.compare(a,b))
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException());
        System.out.println(secondLargest);*/

        /**/

       /* How to find sum of all digits of a number in Java?
        int number = 12345;
        int sum =  String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);

        */
         int arr[] = {1,2,3,4,5,6,7};
         int targetsum = 7;
        System.out.println(findPair(arr,targetsum));





    }

    /*
    How To Find Largest Number Less Than Given Number And Without Given Digit?
    Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not contain a given digit ‘D’. For example, If 145 is the given number and 4 is the given digit, then you should find the largest number less than 145 such that it should not contain 4 in it. In this case, 139 will be the answer.

    public static  int abc()
    {
        int number = 145;
        int givenDigit = 4;
        char c =  Integer.toString(givenDigit).charAt(0);

        for(int i= number;i>0;--i){
            if(Integer.toString(number).indexOf(c) == -1)
            {
                return i;
            }

        }
        return -1;
    }
     */

    public static List<List<Integer>> findPair(int[] arr,int targetsum){
        Set<Integer> completePair = new HashSet<>();
        List<List<Integer>> pair = new ArrayList<>();

        Arrays.stream(arr)
                .forEach(num->{
                    int complete = targetsum-num;
                    if(completePair.contains(complete))
                    {
                        List<Integer> list = Arrays.asList(num,complete);
                        pair.add(list);
                    }
                    completePair.add(num);
                });
    return pair;
    }

}
