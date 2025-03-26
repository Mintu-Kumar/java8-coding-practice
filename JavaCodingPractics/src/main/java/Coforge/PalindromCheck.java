package Coforge;

import java.util.stream.IntStream;

/**
 * Check given string is palindrome using java 8 stream api
 */
public class PalindromCheck {

    public static void main(String[] args){

        String str = "madam";
        boolean palindrome = IntStream.range(0,str.length()/2)
                                      .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));

        System.out.println(palindrome);
    }
}
