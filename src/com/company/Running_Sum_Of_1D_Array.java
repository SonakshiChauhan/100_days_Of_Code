package com.company;

public class Running_Sum_Of_1D_Array {
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        int runningSum[]=new int[len];
        runningSum[0]=nums[0];
        for(int x=1;x<len;x++){
            runningSum[x]=nums[x]+runningSum[x-1];
        }
        return runningSum;
    }

}
