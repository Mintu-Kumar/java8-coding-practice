package SlidingWindowProbleb;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public  static String minimumSubstring(String s, String target){
        int index = -1, minLen = Integer.MIN_VALUE, count=0,r=0,l=0;
        Map<Character, Integer> map =  new HashMap<>();
        for(int i=0; i<target.length();i++)
            map.put(target.charAt(i),map.getOrDefault(target.charAt(i),0)+1);

        System.out.println("target"+ map);
        while (r<s.length()){

            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>0){
                    count++;
                    map.replace(s.charAt(r),map.get(s.charAt(r))-1);
                }
                map.replace(s.charAt(r),map.get(s.charAt(r))-1);
            }
            else {
                map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            }
            System.out.println(map);
            while (count == target.length()){

                if(r-l+1 < minLen){
                    minLen =  r-l+1;
                    index = l;
                }

                if(map.get(s.charAt(l))<0)
                    map.replace(s.charAt(l),map.get(s.charAt(l))+1);
                else
                    count--;
            }
            r++;
        }
        return index ==-1 ?"":s.substring(index,minLen);
    }
    public static void main(String[] args){

        String  s = "ddaaabbca";
        String target = "abc";
        System.out.println(minimumSubstring(s,target));
    }
}
