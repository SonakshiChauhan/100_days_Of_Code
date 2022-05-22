package com.company;
/*
Runtime-0ms
Memory Usage-42.6 MB
 */
public class Sort_Colors {
    public void sortColors(int[] nums) {
        int x=0,n0=0,n1=0,n2=0,c=0;
        for(x=0;x<nums.length;x++){
            if(nums[x]==0){
                n0++;
            }
            else if(nums[x]==1){
                n1++;
            }
            else{
                n2++;
            }
        }
        for(x=0;x<n0;x++){
            nums[c++]=0;
        }
        for(x=0;x<n1;x++){
            nums[c++]=1;
        }
        for(x=0;x<n2;x++){
            nums[c++]=2;
        }
    }
}
