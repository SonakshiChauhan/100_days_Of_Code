package com.company;
import java.util.*;
/*
Runtime-1ms
Memory Usage-43.6 MB
 */
public class KId_With_Greatest_Number_Of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length,max=-1;
        ArrayList<Boolean>result=new ArrayList<>(n);
        for(int x=0;x<n;x++){
            max=Math.max(candies[x],max);
        }
        for(int y=0;y<n;y++){
            if(candies[y]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
