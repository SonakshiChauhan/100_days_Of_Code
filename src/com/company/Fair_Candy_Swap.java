package com.company;
/*
Runtime-18 ms
Memory Usage-63.3 MB
 */
import java.util.*;
public class Fair_Candy_Swap {
    public int[] fairCandySwap(int[] a, int[] b) {
        int ans[]=new int[2];
        int sa=0,sb=0;
        for(int x:a){
            sa+=x;
        }
        for(int y:b){
            sb+=y;
        }
        int del=(sb+sa)/2;
        int target=sa-del;
        Arrays.sort(b);
        for(int x=0;x<a.length;x++)
        {
            int targetB=a[x]-target;
            ans[0]=a[x];
            int l=0;
            int r=b.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(targetB==b[mid]){
                    ans[1]=b[mid];
                    return ans;
                }
                else if(targetB>b[mid]){l=mid+1;}
                else{r=mid-1;}
            }
        }


        return ans;
    }
}
