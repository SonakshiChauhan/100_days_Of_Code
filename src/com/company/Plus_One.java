package com.company;
/*
Runtime-0 ms
Memory Usage-40.5 MB
 */
public class Plus_One {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>-1;i--){
            if(digits[i]==9){digits[i]=0;}
            else{digits[i]+=1;
                return digits;}
        }
        int [] res=new int[digits.length+1];
        for(int i=0;i<digits.length+1;i++){
            res[i]=0;
        }
        res[0]=1;
        return res;
    }
}
