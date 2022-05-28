//package com.company;
///*
//Runtime-1 ms
//Memory-43.5 MB
// */
///**
// * // This is MountainArray's API interface.
// * // You should not implement it, or speculate about its implementation
// * interface MountainArray {
// *     public int get(int index) {}
// *     public int length() {}
// * }
// */
//public class Find_In_Mountain_Array {
//    public int findInMountainArray(int target, MountainArray arr) {
//        int start=0;
//        int end=arr.length()-1;
//        while(start<end){
//            int mid=start+(end-start)/2;
//            if(arr.get(mid)>arr.get(mid+1)){end=mid;}
//            else{
//                start=mid+1;
//            }
//        }
//        int peak=start;
//        int firstTry = orderAgnostic(arr,target,0,peak);
//        if(firstTry!=-1) return firstTry;
//        return orderAgnostic(arr,target,peak,arr.length()-1);
//    }
//    int orderAgnostic(MountainArray arr,int target,int start,int end){
//        boolean Asc=arr.get(start)<arr.get(end);
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr.get(mid)==target) return mid;
//            if(Asc){
//                if(target>arr.get(mid)) start = mid+1;
//                else end = mid-1;
//            }
//            else{
//                if(target>arr.get(mid)) end = mid-1;
//                else start = mid+1;
//            }
//        }
//        return -1;
//    }
//}
