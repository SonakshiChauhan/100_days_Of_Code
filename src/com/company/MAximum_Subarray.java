package com.company;
/*
Runtime-2ms
Memory Usage-82.5 MB
 */
public class MAximum_Subarray {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int cursum=0;
        for(int x=0;x<nums.length;x++){
            cursum=Math.max(cursum+nums[x],nums[x]);
            max=Math.max(cursum,max);
        }
        return max;
    }
}
