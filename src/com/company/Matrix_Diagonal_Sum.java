package com.company;
/*
Runtime-0ms
Memory Usage-42.3 MB
 */
public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            count+=mat[i][i];
            if(i+i!=i+(mat.length-i-1)){
                count+=mat[i][mat.length-i-1];
            }
        }
        return count;
    }
}
