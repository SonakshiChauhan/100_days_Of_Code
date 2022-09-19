package com.company;

public class Reverse_prefix_of_word {
    public String reversePrefix(String word, char ch) {
        char[] wordChars = word.toCharArray();

        // init left to 0

        int left = 0;

        // init right to word index of ch

        int right = word.indexOf(ch);



        // while left is less than right

        while (left < right) {

            // init temp to wordChars at left

            char temp = wordChars[left];

            // set wordChars at left to wordChars at right

            wordChars[left] = wordChars[right];

            // set wordChars at right to temp

            wordChars[right] = temp;

            // increase left by 1

            left++;

            // decrease right by 1

            right--;

        }



        // return new string of wordChars

        return new String(wordChars);
    }
}
