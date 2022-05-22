package com.company;
/*
Runtime-0ms
Memory Usage-41.6 MB
 */
public class Minimum_cost_to_remove_chips_to_same_position {
    public int minCostToMoveChips(int[] position) {
        int even_cnt=0;
        int odd_cnt=0;
        for(int i:position){
            if(i%2==0){
                even_cnt++;
            }
            else{
                odd_cnt++;
            }
        }

        return Math.min(odd_cnt,even_cnt);
    }
}
