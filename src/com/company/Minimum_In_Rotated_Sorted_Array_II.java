package com.company;
/*
Runtime-1 MS
Space-43.4 MB
 */
public class Minimum_In_Rotated_Sorted_Array_II {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]==nums[h]){
                h--;
            }
            else if(nums[h]>nums[mid]){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return nums[l];

    }
}
