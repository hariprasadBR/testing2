package selniumlogic;

import java.util.HashSet;

public class longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "abcdabsvsjkssabdehbhbqkjenjeqakjejwinlql;wejdnmq;eind";
        
        // Initialize variables
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int maxLength = 0;
        int startIndex = 0;

        // Find the longest substring without repeating characters
        while (end < str.length()) {
            if (!set.contains(str.charAt(end))) {
                set.add(str.charAt(end));
                if (end - start + 1 > maxLength) {
                    maxLength = end - start + 1;
                    startIndex = start;
                }
                end++;  
            } else {
                set.remove(str.charAt(start));
                start++;
            }
        }
        
        // Print the longest substring and its length
        String longestSubstring = str.substring(startIndex, startIndex + maxLength);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length of the longest substring: " + maxLength);

	}

}
