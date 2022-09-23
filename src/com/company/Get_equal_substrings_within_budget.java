package com.company;

public class Get_equal_substrings_within_budget {
    public int equalSubstring(String s, String t, int maxCost) {
        int totalMax=0;
        int currentMax=0;
        int currentCost=0;

        for(int x=0;x<s.length();x++){
            currentCost+=Math.abs(s.charAt(x)-t.charAt(x));
            currentMax++;

            while(currentCost>maxCost){
                currentMax--;
                currentCost-=Math.abs(s.charAt(x-currentMax)-t.charAt(x-currentMax));
            }

            if(totalMax<currentMax){
                totalMax=currentMax;
            }
        }
        return totalMax;
    }
}
