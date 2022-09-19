package com.company;

public class Length_of_last_word {
    public int lengthOfLastWord(String s) {
        int n =s.length();

        int length=0;

        for(int i=n-1;i>=0;i--){

            if (s.charAt(i) != ' ') { // a letter is found so count

                length++;

            } else {  // it's a white space instead

                //  Did we already started to count a word ? Yes so we found the last word

                if (length > 0) return length;

            }

        }

        return length;
    }
}
