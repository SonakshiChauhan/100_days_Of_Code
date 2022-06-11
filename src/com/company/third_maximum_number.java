package com.company;
/*
Runtime- 1ms
Memory-43.3 MB
 */
public class third_maximum_number {
    public int thirdMax(int[] nums) {
        // Arrays.sort(nums);
        // int firstDistinct=nums[nums.length-1];
        // int c=1;
        // int ret=0;
        // for(int i=nums.length-1;i>=0;i--){
        //     if(c<3 && i!=0){
        //     if(nums[i]>nums[i-1]){
        //         c++;
        //         ret=nums[i-1];
        //     }
        //     }
        //     else{
        //         if(c==3)
        //         return ret;
        //     }
        // }
        // return firstDistinct;
        long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;
        for(int num:nums){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2 && num!=max1){
                max3=max2;
                max2=num;
            }
            else if(num>max3 && num!=max1 && num!=max2) max3=num;
        }
        return (int) (max3==Long.MIN_VALUE?max1:max3);
    }
}
