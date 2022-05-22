package com.company;
import java.util.*;
/*
Runtime-2ms
Memory Usage-50.8 MB
 */
public class Lucky_Numbers_in_Matrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List list = new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            int index=0;
            int min= 999999999;

            for (int j = 0; j <matrix[i].length ; j++) {

                if(matrix[i][j]<min) {
                    min = matrix[i][j];   //find min. element in row
                    index = j;
                }
            }
            boolean isTrue=true;

            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][index]<matrix[j][index])  // check if the min. element in the row is max. in the column
                    isTrue=false;

            }
            if(isTrue==true)                 //if the min. element in the row is max. in the column then it is our required ans.
                list.add(matrix[i][index]);
        }
        return list;
    }
}
