package com.company;
/*
Runtime-1ms
 */
public class Binary_string_having_morethan_one_repeated_ones {
    public boolean checkOnesSegment(String s) {
        for(int i = 0; i<s.length()-1; i++){

            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){

                return false;

            }

        }

        return true;
    }
}
