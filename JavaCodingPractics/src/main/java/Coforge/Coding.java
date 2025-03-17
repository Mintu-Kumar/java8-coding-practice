package Coforge;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Coding {

    public static void main(String[] args){
        String s =  "good morning";

       String  s1 =   Arrays.stream(s.split(" ")).map(word->word.substring(0,1).toUpperCase()+word.substring(1)).collect(Collectors.joining(" "));
        System.out.println(s1);
    }
}
