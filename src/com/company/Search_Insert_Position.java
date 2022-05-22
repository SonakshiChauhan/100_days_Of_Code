package com.company;
/*
Runtime-0 ms
Memory Usage-43.4 MB
 */
public class Search_Insert_Position {
    public int searchInsert(int[] ar, int target) {
        if(ar.length==0 || ar==null){return 0;}
        int start=0;
        int end=ar.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid]==target){return mid;}
            else if(ar[mid]>target){end=mid-1;}
            else{start=mid+1;}
        }
        return start;
    }
}
