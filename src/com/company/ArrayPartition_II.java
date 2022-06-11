package com.company;
/*
Runtime-12 MS
Memory-44.3 MB
 */
import java.util.Arrays;

public class ArrayPartition_II {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2){
            return nums[0];
        }
        int sum=0;
        for(int x=0;x<nums.length;x+=2){

            sum+=nums[x];

        }
        return sum;
    }
}
