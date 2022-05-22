package com.company;
/*
Runtime-1 ms
Memory Usage-41.7 MB
 */
import java.util.*;
public class check_if_n_and_its_double_exists {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> setB=new HashSet<Integer>();
        for(int x:arr){

            if(setB.contains(2*x)){return true;}
            if(setB.contains(x/2) && x%2==0){return true;}
            setB.add(x);
        }
        return false;
    }
}
