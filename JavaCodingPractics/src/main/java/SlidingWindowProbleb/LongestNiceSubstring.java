package SlidingWindowProbleb;

/*
 A string s is nice if, for every letter of the alphabet that s contains,
 it appears both in uppercase and lowercase. For example, "abABB" is nice because
 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b'
 appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple,
return the substring of the earliest occurrence. If there are none, return an empty
string.

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.
Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.
 */


// This code taken from somewhere

public class LongestNiceSubstring {

    public static boolean isNice(String s) {
        // Use a set to track the characters in lowercase and uppercase
        boolean[] lowercase = new boolean[26];
        boolean[] uppercase = new boolean[26];

        // Traverse the string and mark the characters in their respective arrays
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercase[ch - 'a'] = true;
            } else if (Character.isUpperCase(ch)) {
                uppercase[ch - 'A'] = true;
            }
        }

        // Check if every character that appears has both lowercase and uppercase versions
        for (int i = 0; i < 26; i++) {
            if (lowercase[i] && !uppercase[i] || uppercase[i] && !lowercase[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test the isNice function
        System.out.println(isNice("YazaAay"));  // true
        System.out.println(isNice("Bb"));    // false
        System.out.println(isNice("c"));     // true
        
    }
}
