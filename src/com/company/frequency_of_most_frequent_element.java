package com.company;

import java.util.Arrays;

public class frequency_of_most_frequent_element {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=0,res=1;
        long total=0;
        while(r<nums.length){
            total+=nums[r];
            while(nums[r]*(r-l+1)> total+k){
                total-=nums[l];
                l=l+1;
            }
            res=Math.max(res,r-l+1);
            r+=1;
        }
        return res;

    }
}
