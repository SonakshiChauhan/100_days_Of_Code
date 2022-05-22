package com.company;
/*
Runtime-14 ms
Memory usage-38.9 MB
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class First_Bad_Version {
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int minGood=1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(isBadVersion(mid)){
                end=mid-1;
                minGood=mid;
            }
            else{
                start=mid+1;
            }
        }
        return minGood;
    }
}
