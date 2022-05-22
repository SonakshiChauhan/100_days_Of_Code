package com.company;

public class How_Many_Numbers_Are_Smaller_Than_Current {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ar[]=new int [nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count =0;
            for(int j=0;j<nums.length;j++){

                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            ar[i]=count;
        }
        return ar;
    }
}
