package com.company;
import java.util.*;
/*
Runtime-3ms
Memory usage-41.7 MB
 */
public class Special_Array {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int lo=0;
        int hi=n-1,mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(nums[mid]>=n-mid&& (mid==0 || n-mid>nums[mid-1]) ){
                return n-mid;
            }
            else if(nums[mid]<n-mid){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
}
