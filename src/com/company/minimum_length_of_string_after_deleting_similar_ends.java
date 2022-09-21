package com.company;

public class minimum_length_of_string_after_deleting_similar_ends {
    public int minimumLength(String s) {
        int lo = 0, hi = s.length()-1;
        while(lo<hi){
            char p1 = s.charAt(lo);
            char p2 = s.charAt(hi);
            if(p1==p2){
                while(lo<=hi && s.charAt(lo)==p1) lo++;
                while(lo<=hi && s.charAt(hi)==p2) hi--;
            }
            else return hi-lo+1;
        }
        return (hi-lo>=0)?1:0;

    }
}
