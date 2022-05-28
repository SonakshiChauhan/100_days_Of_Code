package com.company;
/*
Runtime-48 ms
Space-54.7 MB
 */
public class Koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=1;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        while(left<right){
            int middle=(left+right)/2;
            int hourSpent=0;
            for(int pile:piles){
                hourSpent+=Math.ceil((double)pile/middle);
            }
            if(hourSpent<=h){right=middle;}
            else{
                left=middle+1;
            }
        }
        return right;
    }
}
