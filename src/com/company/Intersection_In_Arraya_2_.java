package com.company;
import java.util.*;
/*
Time-4 ms
Memory-43.7 MB
 */
public class Intersection_In_Arraya_2_ {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){

                j++;
            }
            else if(nums1[i]<nums2[j]){

                i++;
            }
        }
        int ans[]=new int[list.size()];
        for(int x=0;x<ans.length;x++){
            ans[x]=list.get(x);
        }
        return ans;
    }
}
