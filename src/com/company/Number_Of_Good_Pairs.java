package com.company;
/*
Runtime=1ms
Memory Usgae=41.9 MB
 */
public class Number_Of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] ){
                    c=c+1;
                }
            }
        }
        return c;
    }
}
