package com.company;
/*
Runtime-7 ms
Memory Usage-64.4 mB
 */
public class Spiral_Matrix_Three {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
    int [][] matrix=new int[rows*cols][2];
    int i=0;
    matrix[i++]=new int[]{rStart,cStart};
    int len=0;
    int d=0;
    int[] directions=new int[]{0,1,0,-1,0};
        while(i<rows*cols){
        if(d==0 || d==2){
            len++;
        }
        for(int x=0;x<len;x++){
            rStart+=directions[d];
            cStart+=directions[d+1];
            if(rStart<rows && rStart>=0 && cStart<cols && cStart>=0){
                matrix[i++]=new int[]{rStart,cStart};
            }
        }
        d=++d%4;
    }
        return matrix;
}
}
