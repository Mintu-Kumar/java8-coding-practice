package org.example;

import java.util.stream.IntStream;

public class PalindromCheck {

    public static void main(String[] args){
        String str = "ROTATOR";

        String reverseStr =  new StringBuffer(str).reverse().toString();
        boolean isPalindrom = IntStream.rangeClosed(0,str.length()/2).
                              noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1));
        if(str.equals(reverseStr))
            System.out.println(str+" is palindrom");
        else
            System.out.println(str+" is not palindrom");
    }
}
