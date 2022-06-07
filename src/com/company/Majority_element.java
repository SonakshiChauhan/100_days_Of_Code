package com.company;

import java.util.Arrays;

/*
Runtime-4ms
Space-56.3 MB
 */
public class Majority_element {
    public int majorityElement(int[] nums) {
//         int res=0;
//         int idx=0,x=0,y=0;
//         int majorityCount=nums.length/2;
//         if(nums.length==1){
//             return nums[0];
//         }
//         for(x=0;x<nums.length;x++){
//             int c=0;
//             for(y=0;y<nums.length;y++){
//                 if(nums[x]==nums[y]){c++;}
//             }
//             if(c>majorityCount){
//                 return nums[x];
//             }

//         }
//         return -1;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
