package com.company;
/*
Runtime-3 ms
Memory Usage-127.8 MB
 */
public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int x=0;x<n;x++){
            if(nums[x]<=0 ||nums[x]>n){
                nums[x]=n+1;
            }
        }
        for(int x=0;x<n;x++){
            int id=Math.abs(nums[x]);
            if(id>n) continue;
            id--;
            if(nums[id]>0) nums[id]=-nums[id];
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}
