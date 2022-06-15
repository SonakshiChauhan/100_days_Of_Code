package com.company;
import java.util.Arrays;
/*
Runtime-9 MS
Space-55 MB
 */
public class largest_perimeter_triangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-3;i>=0;i--){
            if(A[i]+A[i+1]>A[i+2]){
                return A[i]+A[i+1]+A[i+2];
            }
        }
        return 0;
    }
}
