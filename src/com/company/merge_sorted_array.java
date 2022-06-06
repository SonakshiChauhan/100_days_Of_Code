package com.company;
/*
Time-0ms
Space-42.8 MB
 */
public class merge_sorted_array {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int p=m+n-1;
        int p1=m-1;
        int p2=n-1;
        while(p1>=0 && p2>=0){
            if(n1[p1]>n2[p2]){
                n1[p]=n1[p1];
                p1--;
                p--;
            }
            else{
                n1[p]=n2[p2];
                p2--;
                p--;
            }
        }
        while(p2>=0){
            n1[p]=n2[p];
            p2--;
            p--;
        }
    }
}
