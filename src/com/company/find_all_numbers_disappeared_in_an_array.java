package com.company;

import java.util.ArrayList;
import java.util.List;

public class find_all_numbers_disappeared_in_an_array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> Lst= new ArrayList<>();
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                Lst.add(index+1);

            }
        }
        return Lst;
    }
    void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
