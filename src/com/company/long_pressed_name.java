package com.company;
/*
Runtime-1ms
Space-42.4 MB
 */
public class long_pressed_name {
    public boolean isLongPressedName(String name, String typed) {
        char[] a= name.toCharArray();
        char[] b=typed.toCharArray();
        int i=0,j=0;
        if(a.length>b.length || a[0]!=b[0]){
            return false;
        }
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                i++;
                j++;
            }
            else{
                i--;
                if(a[i]!=b[j]){return false;}
            }
        }
        while(j<b.length){
            if(a[a.length-1]!=b[j]){
                return false;
            }
            j++;
        }
        return i==a.length;
    }
}
