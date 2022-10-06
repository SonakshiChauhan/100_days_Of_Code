package com.company;
import java.util.*;
public class binary_search_using_recursion {
    public static void main(String args[]){
        int arr[]={2,5,26,71,88};
        System.out.println(search(arr,88));
    }
    public static int search(int arr[],int target){
        return binary_search(arr,0,arr.length-1,target);
    }
    public static int binary_search(int arr[],int l,int r,int target) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binary_search(arr, l, mid - 1, target);
            }
                return binary_search(arr, mid + 1, r, target);


        }
        return -1;
    }
}
