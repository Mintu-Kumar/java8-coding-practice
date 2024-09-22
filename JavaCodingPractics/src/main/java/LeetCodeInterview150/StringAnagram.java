package LeetCodeInterview150;

import java.security.PublicKey;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {

    public static boolean checkAnagram(String s, String t){
        String s1 = Stream.of(s.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String t1 = Stream.of(t.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(s1.equals(t1))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        String s = "Racecawwr";
        String t = "CarRace";

        if(checkAnagram(s,t))
            System.out.println("Is anagram");
        else
            System.out.println("not anagram");
    }
}
