package com.company;
/*
Runtime-10ms
Space-46.8 MB
 */
public class Valid_Palindrome {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        // Add all those digits in s that is an alphabet or a digit.
        // Convert all alphabets to lower case.
        for(int i = 0; i < s.length(); i++)
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                sb.append(Character.toLowerCase(s.charAt(i)));

        // Declare a string to save the value of StringBuilder.
        String t = sb.toString();
        return t.equals(sb.reverse().toString());
    }
}
