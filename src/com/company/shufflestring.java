package com.company;
/*
Runtime-1ms
Space-42.8 MB
 */
public class shufflestring {
    public String restoreString(String str, int[] indices) {
        char arr[]=new char[str.length()];
        //char s[]=str.toCharArray();
        String joined="";
        for(int x=0;x<str.length();x++){
            arr[indices[x]]=str.charAt(x);
        }
        joined = String. valueOf(arr);
        return joined;
    }
}
