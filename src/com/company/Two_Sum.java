package com.company;
/*
Runtime-71ms
Memory Usage-44.6 MB
 */
public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int index1=0,index2=0;
        int ans[]=new int[2];
        for(int x=0;x<nums.length-1;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x]+nums[y] == target){
                    index1=x;
                    index2=y;
                    break;
                }

            }
        }
        ans[0]=index1;
        ans[1]=index2;
        return ans;
    }
}
