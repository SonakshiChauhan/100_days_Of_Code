package com.company;
/*
Runtime-0ms
Memory Usage-40.4 MB
 */
import java.util.*;
public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> res=new ArrayList();
        if(matrix.length==0) return res;
        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        while(rowStart <=rowEnd && colStart<=colEnd){
            for(int x=colStart;x<=colEnd;x++){
                res.add(matrix[rowStart][x]);
            }
            rowStart++;
            for(int x=rowStart;x<=rowEnd;x++){
                res.add(matrix[x][colEnd]);
            }

            colEnd--;
            if(rowStart<=rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    res.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return res;
    }
}
