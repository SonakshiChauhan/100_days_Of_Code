package com.company;
/*
Runtime-3 ms
Memory Usage-59.4 MB
 */
public class Check_If_Good_Array {
    public boolean isGoodArray(int[] nums) {
        int n=nums.length;
        if(n==1&& nums[0]==1){
            return true;
        }
        int ans=nums[0];
        for(int x=1;x<n;x++){
            ans=gcd(ans,nums[x]);
            if(ans==1){
                return true;
            }
        }
        return false;


    }
    public int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
