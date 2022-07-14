package com.company;

import java.util.Arrays;
/*
Runtime-3ms
Memory-43.2 MB
 */
public class Maximum_product {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }
}
