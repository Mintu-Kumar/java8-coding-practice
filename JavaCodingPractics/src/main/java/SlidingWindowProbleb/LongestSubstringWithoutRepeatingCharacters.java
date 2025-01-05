package SlidingWindowProbleb;

import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {

//https://javaconceptoftheday.com/find-longest-substring-without-repeating-characters-java/
    public static int longestSubstring(String s){
        char[] c =  s.toCharArray();
        int longestStringLength =0;
        String longestString = null;

        //using LinkedHashMap because it is preserve the order
        LinkedHashMap<Character,Integer> map =  new LinkedHashMap<>();
        for(int i=0;i<c.length;i++){
            Character  ch = c[i];

            if(!map.containsKey(c[i])){
                map.put(ch,i);
            }
            else{
                i= map.get(ch);
                map.clear();
            }
            if(map.size()>longestStringLength){
                longestStringLength = map.size();
                longestString = map.keySet().toString();
            }

        }
        System.out.println(longestStringLength);
        return longestString.length();

    }
    public static void main(String[] args){
        System.out.println(longestSubstring("javaconceptoftheday"));



    }
}
