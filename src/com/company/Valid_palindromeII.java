package com.company;
/*
Runtime-2ms
 */
public class Valid_palindromeII {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // delete left or right
                return helper(s, i + 1, j) || helper(s, i, j - 1);
            }
        }

        return true;
    }

    private boolean helper(String s, int start, int end) {
        int i = start, j = end;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
