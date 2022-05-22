package com.company;
/*
Runtime-0ms
Memory Usage-45.7 MB
*/
public class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        for(int x=0;x<n;x++){
            ans[2*x]=nums[x];
            ans[2*x+1]=nums[n+x];
        }
        return ans;
    }
}
