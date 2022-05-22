package com.company;
/*
Runtime-2 ms
Memory Usage-50.7 MB
 */
import java.util.Arrays;
public class Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int ans[]=new int[n];
        Arrays.fill(ans,1);
        if(n==1){return nums;}
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }
        for(int k=0;k<n;k++){
            ans[k]=left[k]*right[k];
        }
        return ans;
    }
}
