package com.company;
/*Runtime-0ms
 Memory Usage-41.8ms
*/
public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max=0,sum=0;
        for(int i = 0; i < accounts.length; i++) {
            sum=0;
            for(int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];

            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
