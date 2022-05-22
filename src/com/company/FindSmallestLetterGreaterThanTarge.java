package com.company;
/*
Runtime-0 ms
Memory Usage-48.1 MB
 */
public class FindSmallestLetterGreaterThanTarge {
    public char nextGreatestLetter(char[] letters, char target) {
        int len=letters.length;
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%len];
    }
}
