package com.company;

public class Determine_if_Strings_are_alike {
    public boolean halvesAreAlike(String s) {

        int count = 0;
        for(int i=0;i<s.length() / 2;i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c =='i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') count++;
        }
        for(int i=s.length() / 2;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c =='i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') count--;
        }
        return count == 0;
    }
    }

