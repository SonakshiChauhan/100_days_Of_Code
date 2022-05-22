package com.company;
import java.util.*;
/*
Runtime-1 ms
Memory Usgae-44.3 MB
 */
public class RemovesDuplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int c = 0;
        for (int x = 1; x < nums.length; x++) {
            if (nums[x] != nums[x - 1]) {
                c = c + 1;
                nums[c] = nums[x];
            }
        }
        c = c + 1;
        return c;
    }
}
