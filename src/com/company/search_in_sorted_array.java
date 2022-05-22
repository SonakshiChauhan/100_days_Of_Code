package com.company;
/*
Runtime-1ms
Memory Usage-42.8 MB
 */
public class search_in_sorted_array {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);

        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }
    int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <=end){
            int mid=start+(end-start)/2;
            if(mid< end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
    int binarySearch(int[] ar, int target , int start , int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==ar[mid]){
                return mid;
            }
            else if(target>ar[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
