package com.company;

import java.util.HashMap;
//Runtime-6 ms
//Memoery-54.8 MB
public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int x=1;x<nums.length;x++){
//             if(nums[x]==nums[x-1]){
//                 return true;
//             }

//         }

//                 return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }
            else{
                map.put(i,1);
            }
        }
        return false;

    }
}
