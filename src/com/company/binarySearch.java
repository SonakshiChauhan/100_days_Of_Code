package com.company;
/*
Runtime- 0ms
Memory-53.7 MB
 */
public class binarySearch {
    public int search(int[] nums, int target) {
        int s=0;
        int l=nums.length-1;
        int mid;
        while(s<=l){
            mid=s+(l-s)/2;
            if(nums[mid]==target){return mid;}
            else if(target<nums[mid]){
                l=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;

    }
}
