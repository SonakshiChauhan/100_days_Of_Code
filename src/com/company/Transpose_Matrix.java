package com.company;
/*
Runtime-0ms
Memory Usage-42.9 MB
 */
public class Transpose_Matrix {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int ne[][]= new int[m][n];
        for(int x=0;x<n;x++){
            for(int y=0;y<m;y++){
                ne[y][x]=matrix[x][y];
            }
        }
        return ne;
    }
}
