package com.company;
/*
Runtime-1ms
MEmory Usage-41.6 MB
 */
public class Find_Number_with_even_number_of_digits {
    public int findNumbers(int[] nums) {

        int sum=0;
        for(int n:nums){
            if(n>9 && n<100 || n>999 && n <10000 || n==100000){
                sum++;
            }
        }
        return sum;
    }
}
