package com.company;

public class Duplicates_in_an_array {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }

            else{
                i++;
            }
        }
        return -1;
    }
    void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
