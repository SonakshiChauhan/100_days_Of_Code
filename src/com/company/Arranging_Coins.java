package com.company;
/*
Runtime-2ms
Memory Usage-42.2 MB
 */
public class Arranging_Coins {
    public int arrangeCoins(int n) {
        if(n<0){return -1;}
        if(n<=1){return n;}
        if(n<=3){ return n==3?2:1;}
        long start=2;
        long end=n/2;
        long lev=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            long level=mid*(mid+1)/2;
            if(n == level){return (int)mid;}
            else if(n>level){start=mid+1;}
            else{end=mid-1;}
        }
        return (int)end;
    }
}
