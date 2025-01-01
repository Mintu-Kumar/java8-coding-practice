package SlidingWindowProbleb;

import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {


    public static void longestSubstring(String s){
        char[] c =  s.toCharArray();
        int longestStringLength =0;
        String longestString = null;

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
        System.out.println("Longest string: - "+ longestString);
        System.out.println("Length of that string:-"+ longestStringLength);

    }
    public static void main(String[] args){
        longestSubstring("javaconceptoftheday");

        System.out.println("==========================");

        longestSubstring("thelongestsubstring");

    }
}
