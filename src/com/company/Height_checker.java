package com.company;

import java.util.Arrays;

public class Height_checker {
    public int heightChecker(int[] heights) {
        int ans[]=new int[heights.length];
        int c=0;
        for(int x=0;x<heights.length;x++){
            ans[x]=heights[x];
        }
        Arrays.sort(ans);
        for(int x=0;x<heights.length;x++){
            if(ans[x]!=heights[x]){
                c++;
            }
        }
        return c;
    }
}
