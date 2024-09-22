package LeetCodeInterview150;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfLastWord {

  public static void lengthOfLastWord(String s){

     List<String>string =  Arrays.asList(s.split(" "));
      Collections.reverse(string);
     String rev =  string.stream().collect(Collectors.joining(" "));
      System.out.println(rev);

  }
    public static void main(String[] args)
    {
        String s = "hello world jaa";
        lengthOfLastWord(s);
    }
}
