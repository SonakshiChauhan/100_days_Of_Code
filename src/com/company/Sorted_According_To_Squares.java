package com.company;
/*
Runtime-1 MS
 */
public class Sorted_According_To_Squares {

        public int[] sortedSquares(int[] nums) {
            int ans[]=new int[nums.length];
            int x=0,y=nums.length-1,c=nums.length-1;
            while(x<=y){
                if((nums[x]*nums[x])<(nums[y]*nums[y])){
                    ans[c--]=nums[y]*nums[y];
                    y--;
                }
                else{
                    ans[c--]=nums[x]*nums[x];
                    x++;
                }
            }
            return ans;
        }
    }

