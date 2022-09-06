package com.company;
/*
Runtime: 1ms
Space: 42.4 MB
 */
public class numberofsubstringsinaword {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int x=0;x<patterns.length;x++){
            boolean flag=false;
            if(word.contains(patterns[x])){flag=true;}
            if(flag){count++;}
        }
        return count;
    }
}
