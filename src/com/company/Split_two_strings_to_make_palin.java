package com.company;

public class Split_two_strings_to_make_palin {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private boolean check(String a, String b){
        int i = 0, j = b.length() - 1;
        while(j > i && a.charAt(i) == b.charAt(j)){
            ++i;
            --j;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private boolean isPalindrome(String s, int i, int j){
        while(j > i && s.charAt(i) == s.charAt(j)){
            ++i;
            --j;
        }
        return i >= j;
    }
}
