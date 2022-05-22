package com.company;
/*
Runtime-1ms
Memory Usage-50.6 MB
 */
public class Two_sum_input_Array_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int lower = 0;
        int upper = numbers.length-1;
        while(lower<upper)
        {
            int mid = numbers[lower]+numbers[upper];
            if(mid==target)
            {
                break;
            }
            else if(mid>target)
            {
                upper--;
            }
            else
            {
                lower++;
            }
        }
        arr[0]=lower+1;
        arr[1]=upper+1;
        return arr;
    }
}
