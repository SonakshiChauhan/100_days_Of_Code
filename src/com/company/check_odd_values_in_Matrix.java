package com.company;
/*
Runtime-1ms
Memory Usage-40.2
 */
public class check_odd_values_in_Matrix {
    public int oddCells(int m, int n, int[][] indices) {
        int mat[][]=new int[m][n];int c=0;
        int row=0;int col=0;
        for(int []a: indices){
            row=a[0];
            col=a[1];
            for(int x=0;x<n;x++){
                mat[row][x]++;
            }
            for(int y=0;y<m;y++){
                mat[y][col]++;
            }
        }
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                if(mat[x][y]%2!=0){
                    c++;
                }
            }
        }
        return c;
    }
}
