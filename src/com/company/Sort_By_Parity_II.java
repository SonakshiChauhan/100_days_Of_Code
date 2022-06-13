package com.company;
/*
Runtime-4 MS
Memory-55.1 MB
 */
public class Sort_By_Parity_II {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[] = new int[nums.length];
        if(nums.length==1){
            return nums;
        }
        int k = 0,j=1;
        for (int y = 0; y < nums.length; y++) {
            if (nums[y] % 2 == 0) {
                ans[k] = nums[y];
                k=k+2;
            }
        }
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] % 2 != 0) {
                ans[j] = nums[x];
                j=j+2;
            }
        }
        return ans;
    }
}

