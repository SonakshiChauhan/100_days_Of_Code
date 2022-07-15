package com.company;

import java.util.Arrays;

/*
Runtime-0ms
Space-41.8MB
 */
public class Two_arrays_equal_by_reversing_subarrays {
    public boolean canBeEqual(int[] target, int[] arr) {

        if(arr.length !=target.length){return false;}
        else if(arr.length==1){
            if(arr[0]==target[0]){return true;}
            else{return false;}
        }

        else{
            Arrays.sort(target);
            Arrays.sort(arr);
            for(int x=0;x<arr.length;x++){
                if(target[x]!=arr[x]){return false;}

            }
        }
        return true;
    }
}
