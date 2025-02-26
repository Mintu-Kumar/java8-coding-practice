package SlidingWindowProbleb;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 *
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exists other ways to achieve this answer too.
 *
 */
public class LongestRepeatingCharacterReplacement {

    public static int longestCharReplacement(String s,int k){
        int l=0,maxFreq=0, result =0;
        Map<Character,Integer> map =  new HashMap<>();

        for(int r=0;r<s.length();r++)
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            maxFreq = Math.max(maxFreq,map.get(s.charAt(r)));

            if(r-l+1-maxFreq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            result =Math.max(maxFreq,r-l+1);
        }
        return result;
    }

    public static void main(String[] args){
        String s ="ABABA";
        int k=2;

        System.out.println(longestCharReplacement(s,k));

    }
}
