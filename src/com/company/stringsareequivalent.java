package com.company;
/*
Runtime: 1ms
Space: 42.1 MB
 */
public class stringsareequivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String a=""/*Arrays.toString(word1)*/;
        // String b=""/*Arrays.toString(word2)*/;
        // for(int x=0;x<word1.length;x++){
        //     a=a+word1[x];
        // }
        // for(int x=0;x<word2.length;x++){
        //     b=b+word2[x];
        // }
        // if(a.equals(b)){return true;}
        // else{return false;}
        StringBuffer w1 = new StringBuffer("");
        for(String ele: word1){
            w1.append(ele);
        }
        StringBuffer w2=new StringBuffer("");
        for(String ele1: word2){
            w2.append(ele1);
        }
        if(w1.length()==w2.length()){
            if(w1.toString().equals(w2.toString())){
                return true;
            }
        }
        return false;
    }
}
