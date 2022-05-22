package com.company;
/*
Runtime-0 ms
Memory Usage- 42.4 MB
 */
public class Find_Unique_Integers_Sum_Upto_Zero {
    public int[] sumZero(int n) {
        int ans[]= new int[n];
        for(int x=0;x<n-1;x++){
            ans[x]=x-n;
            ans[x+1]=n-x;
            x++;
        }
        return ans;
    }
}
