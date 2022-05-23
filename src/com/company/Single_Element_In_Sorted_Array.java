package com.company;
/*
Runtime-0 ms
Memory-60.2 MB
 */
public class Single_Element_In_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        int s=0,end=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums[s]!=nums[s+1]){
            return nums[s];
        }
        else if(nums[end]!=nums[end-1]){
            return nums[end];
        }
        else{
            while(s<=end){
                int mid=s+(end-s)/2;
                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] /*&& (mid>0 || mid<end)*/ ){
                    return nums[mid];
                }
                else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                    s = mid+1;
                }
                else{
                    end=mid;
                }
            }
        }
        return -1;
    }
}
