package com.company;
/*
Runtime-0 ms
Memory Usage-43.6 MB
 */
public class Kth_Missing_Positive_Number {
    public int findKthPositive(int[] ar, int k) {
        int count=1;
        int x=0;
        while(x<ar.length){
            if(ar[x]!=count){
                k--;
                if(k==0){return count;}
                count++;
            }

            else{
                count++;
                x++;
            }
        }
        if(k>0){
            count=count+k-1;
        }
        return count;
    }
}
