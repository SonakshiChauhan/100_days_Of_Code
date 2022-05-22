package com.company;
/*
Runtime-0 ms
Memory Usage-42.1 MB
 */
public class Spiral_Matrix_Two {
    public int[][] generateMatrix(int n) {
        int ans[][]= new int[n][n];
        int rowBeg=0;
        int rowEnd=(n-1);
        int colBeg=0;
        int colEnd=(n-1);
        int c=1;
        while(rowBeg<=rowEnd && colBeg <=colEnd){
            for(int i=colBeg;i<=colEnd;i++){
                ans[rowBeg][i]=c++;
            }
            rowBeg++;
            for(int i=rowBeg;i<=rowEnd;i++){
                ans[i][colEnd]=c++;
            }
            colEnd--;
            if(rowBeg<=rowEnd){
                for(int i=colEnd;i>=colBeg;i--){
                    ans[rowEnd][i]=c++;
                }
            }
            rowEnd--;


            if(colBeg<=colEnd){
                for(int i=rowEnd;i>=rowBeg;i--){
                    ans[i][colBeg]=c++;
                }
            }
            colBeg++;
        }


        return ans;
    }
}
