package LeetCodeInterview150;
// problem in string section Leetcode
public class ValidPalindrom {

    public static boolean isPalindrome(String s) {

        String s1 = s.replaceAll("[^a-zA-Z]","").toLowerCase();
        String s2 = new StringBuffer(s1).reverse().toString();
        return s1.equals(s2) ? true:false;
    }

    public static void  main(String[] args){
      String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
