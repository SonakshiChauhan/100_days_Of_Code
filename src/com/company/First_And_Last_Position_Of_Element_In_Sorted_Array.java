package com.company;
/*
Runtime-0ms
Memory Usage-47 MB
 */
public class First_And_Last_Position_Of_Element_In_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length-1;
        int ans[]={-1,-1};
        int startValue=search(nums,target,true);
        int endValue=search(nums,target,false);
        ans[0]=startValue;
        ans[1]=endValue;
        return ans;
    }
    int search(int[] nums,int target,boolean firstStartIndex){
        int start=0;
        int end=nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(firstStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
