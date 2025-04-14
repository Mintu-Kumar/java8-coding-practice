package Coforge;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {


    /**
     * Reverse the string using java 8 stream api
     * @param args
     */

    public static  void main(String[] args){

        String str = "Noorus Khan";

        List<Character> list = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());

      String reverseString =   list.stream().collect(StringBuilder::new,
                (sb,c)->sb.insert(0,c),StringBuilder::append).toString();
        System.out.println(reverseString);
    }
}
