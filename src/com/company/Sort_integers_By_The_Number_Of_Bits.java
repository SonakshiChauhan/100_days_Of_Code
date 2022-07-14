package com.company;
/*
Runtime-13ms
Space-46.8 MB
 */
import java.util.*;

public class Sort_integers_By_The_Number_Of_Bits {
    public int[] sortByBits(int[] a) {
        Arrays.sort(a);
        List<Integer> li=new ArrayList<>();
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int x=Integer.bitCount(a[i]);
            if(!li.contains(x)) li.add(x);
            map.putIfAbsent(x,new ArrayList<>());
            map.get(x).add(a[i]);
        }
        Collections.sort(li);
        int k=0;
        int ans[]=new int[a.length];

        for(int i=0;i<li.size();i++){
            List<Integer> temp=map.get(li.get(i));
            for(int j=0;j<temp.size();j++){
                ans[k]=temp.get(j);
                k++;
            }
        }
        return ans;
    }
}
