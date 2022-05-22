package com.company;

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int ans[]=new int[2*len];
        for(int x=0;x<len;x++){
            ans[x]=nums[x];
            ans[len+x]=nums[x];
        }
        return ans;
    }
}
