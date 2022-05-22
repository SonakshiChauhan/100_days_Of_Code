package com.company;
/*
Runtime-0ms
Memory Usage-39.9 MB
 */
public class Find_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        for(int n:gain){
            sum=sum+n;
            if(sum>max){max=sum;}
        }
        return max;
    }
}
