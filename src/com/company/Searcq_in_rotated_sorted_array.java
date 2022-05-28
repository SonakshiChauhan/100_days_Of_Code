package com.company;
/*
Runtime-1ms
Memory-42.3 MB
 */
public class Searcq_in_rotated_sorted_array {
    public int findMin(int[] nums) {
        int pivot=findPivot(nums);
        int no_of_times=pivot+1;
        return nums[no_of_times];
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
}
