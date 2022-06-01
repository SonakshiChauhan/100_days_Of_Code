package com.company;
/*
runtime-2ms
memory-41.5 MB
 */
public class reach_a_number {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int sum=0;
        int step=0;
        while(sum<target){
            step++;
            sum=sum+step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;

    }
}
