package com.company;
/*
Runtime-1 ms
Memory-49.4 mB
 */
public class Count_Negative_numbers_In_A_Sorted_Matrix {
    public int countNegatives(int[][] ar) {

        int count=0;
        for(int x=0;x<ar.length;x++){
            int col=ar[0].length;
            if(ar[x][0]<0){
                count+=ar[x].length;
                continue;
            }
            if(ar[x][col-1]>0){
                continue;
            }
            int start=0;
            int end=col-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(ar[x][mid]<0){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            count+=ar[x].length-start;
        }
        return count;

    }
}
