package Coforge;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeOnString {

    /**
     * 1. Reverse a String
     * 2. Check if a String is Palindrome
     * 3. Count the Occurrence of a Character - imp
     * 4. Remove All Whitespaces from a String
     * 5. Convert a String to Uppercase
     * 6. Convert a String to Lowercase
     * 7. Remove Duplicate Characters from a String  -- imp
     * 8. Find the Longest Word in a Sentence -- imp
     * 9. Check if String Contains a Substring Using
     * 10. String Join with Streams for Collections
     * 11. Filter all words which starts with J - Arrays.asList("Java", "Python", "JavaScript", "Ruby", "Java");
     * 12 String capitalization fist letter of each word -  String str = "java 8 features";
     * 13. How to count the number of vowels and consonants in a string?  -- imp
     * 14. How to check if a string contains only digits?  -- imp
     * @param args
     */
    public static void main(String[] args){
        String s =  "good morning features";

      // Q7   String s2 =  s.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

      // Q8
     /* String log =   Arrays.stream(s.split(" "))
                .max((word1,word2)->Integer.compare(word1.length(),word2.length()))
                .orElse("");
        System.out.println(log);*/

        // Q9
       /* boolean status = Arrays.stream(s.split(" ")).anyMatch(word->word.contains("features"));
        System.out.println(status);*/

        // Q10
         /*List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
         String join = list.stream().collect(Collectors.joining(","));
         System.out.println(join);*/

        //Q11
        /*List<String> list= Arrays.asList("Java", "Python", "JavaScript", "Ruby", "Java");
        List<String> startWithJ = list.stream()
                                        .filter(word->word.startsWith("J"))
                                        .collect(Collectors.toList());
        System.out.println(startWithJ);*/

        //@12
       /* String str = "java 8 features";
         String st =   Arrays.stream(str.split(" ")).map(word->word.substring(0,1).toUpperCase()+word.substring(1)).collect(Collectors.joining(" "));
        System.out.println(st);*/

        //@13
        /*   String str = "Java Programming";
           Map<Boolean,Long> result =  str.toLowerCase().chars().mapToObj(c->(char)c)
                    .collect(Collectors.partitioningBy(c->"aeiou".indexOf(c)!=-1,Collectors.counting()));
            System.out.println(result.get(true));
            System.out.println(result.get(false));*/

        //@14
         /*String str = "12345";
        boolean status = str !=null&& !str.isEmpty() && str.chars().allMatch(Character::isDigit);
        System.out.println(status);*/


    }
}
