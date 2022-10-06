package com.company;
import java.util.*;
public class Min_Max_Using_Recurison {
    public static void main(String args[]){
    int A[]={-1,4,32,89,-67,0};
    int n=A.length;
    System.out.println(find_min(A,n));
        System.out.println(find_max(A,n));
    }
    public static int find_min(int a[],int n){
        if(n==1){
            return a[0];
        }
        return Math.min(a[n-1], find_min(a, n-1));

    }
    public static int find_max(int a[],int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1],find_max(a,n-1));
    }
}
