package com.company;
/*
Runtime-40 ms
Memory-75.8 MB
 */
import java.util.Arrays;
import java.util.HashMap;

public class Rank_Transform {
    public int[] arrayRankTransform(int[] ar) {
        int sorted[] = ar.clone();
        Arrays.sort(ar);
        int counter=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x=0;x<ar.length;x++){
            if(!map.containsKey(ar[x])){map.put(ar[x],counter++);}
        }
        for(int x=0;x<ar.length;x++){
            sorted[x]=map.get(sorted[x]);
        }
        return sorted;
    }
}
