package com.company;
/*Runtime-1ms
Memory Usage-42.8 MB
 */
public class Jump_Game {
    public boolean canJump(int[] nums) {
        int lastgoodpos=nums.length-1;
        for(int x=lastgoodpos-1;x>=0;x--){
            if(x+nums[x]>=lastgoodpos){
                lastgoodpos=x;
            }
        }
        return lastgoodpos==0;
    }
}
