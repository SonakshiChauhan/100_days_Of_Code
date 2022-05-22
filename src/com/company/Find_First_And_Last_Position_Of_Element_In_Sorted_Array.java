package com.company;
/*
Runtime-1ms
MEmory Usage-47.9 MB
 */
public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int n1 = -1;
        int n2 = -1;
        int[] ans = new int[2];
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (nums[start] == target){
                n1 = start;
            }
            if (nums[end] == target){
                n2 = end;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                if(n1 == -1){
                    start++;
                }
                else if(n2 == -1){
                    end--;
                }
                else{
                    break;
                }
            }
        }
        ans[0] = n1;
        ans[1] = n2;
        return ans;
    }
}

