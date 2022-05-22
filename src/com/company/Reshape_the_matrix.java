package com.company;
import java.util.*;
public class Reshape_the_matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n ||(r==m && c==n)){return mat;}
        int res[][]= new int[r][c];
        int rowres=0;
        int colres=0;
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                if(colres<c){
                    res[rowres][colres]=mat[x][y];
                    colres++;
                }
                else{
                    rowres++;
                    colres=0;
                    res[rowres][colres]=mat[x][y];
                    colres++;
                }
            }
        }
        return res;
    }
}
