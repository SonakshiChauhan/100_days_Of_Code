package com.company;

import java.util.HashMap;

/*
Runtime-250 MS
Space-67.5 MB
 */
public class Four_SumII {
    public int fourSumCount(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=arr1.length,pairSum,remPairSum,fourSumCount=0;

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                pairSum=arr1[i]+arr2[j];

                if(hm.containsKey(pairSum))
                    hm.put(pairSum,hm.get(pairSum)+1);
                else
                    hm.put(pairSum,1);
            }


        for(int k=0;k<n;k++)
            for(int l=0;l<n;l++)
            {
                pairSum=arr3[k]+arr4[l];
                remPairSum=(0-(arr3[k]+arr4[l]));

                if(hm.containsKey(remPairSum))
                    fourSumCount+=hm.get(remPairSum);
            }

        return fourSumCount;
    }
}
