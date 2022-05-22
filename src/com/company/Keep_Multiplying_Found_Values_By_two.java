package com.company;
/*
Runtime-3 ms
Memory-44.3 MB
 */
import java.util.*;
public class Keep_Multiplying_Found_Values_By_two {
    public int findFinalValue(int[] a, int t) {
        // Set<Integer> setB=new HashSet<Integer>();
        //  for(int x:arr){
        //     setB.add(x);
        // }
        // for(int x:arr){
        //     if(setB.contains(original)){original*=2;}
        // }
        // return original;
        Arrays.sort(a);
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]==t){
                t*=2;
                s=m+1;
                e=a.length-1;
            }
            else if(a[m]>t)e=m-1;
            else s=m+1;
        }
        return t;
    }
}
