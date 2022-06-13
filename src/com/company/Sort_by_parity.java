package com.company;
/*
Runtime- 1ms
Space- 43.5 MB
 */
public class Sort_by_parity {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];

        int k = 0;
        for (int y = 0; y < nums.length; y++) {
            if (nums[y] % 2 == 0) {
                ans[k++] = nums[y];
            }
        }
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] % 2 != 0) {
                ans[k++] = nums[x];
            }
        }


        return ans;
    }
}
