package com.company;
/*
Runtime-0 ms
Memory Usage-46.4 MB
 */
public class Peak_Index_In_A_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}
