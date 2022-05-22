package com.company;
/*
Runtime-0 ms
Memory-46.1 MB
 */
public class Peak_Index_In_Mountain_Array {
    public int peakIndexInMountainArray(int[] ar) {

        int start=0;
        int end=ar.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(ar[mid]>ar[mid+1]){end=mid;}
            else{start=mid+1;}
        }
        return end;
    }
}
