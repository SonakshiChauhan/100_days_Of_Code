package com.company;
public class Build_Array_From_permutation {
public static void main(String[]args){
        }


        public int[] buildArray(int[] nums) {
            int len=nums.length;
            int ans[]=new int[len];
            for(int x=0;x<len;x++){
                ans[x]=nums[nums[x]];

            }
            return ans;

        }
    }





