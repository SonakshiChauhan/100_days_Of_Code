package com.company;

public class Jump_Game_VII {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length(), available = 0;
        if(s.charAt(n - 1) == '1') return false;

        boolean[] dp = new boolean[n];
        dp[0] = true;

        for(int i = 1; i < n; i++) {
            if(i >= minJump) available += dp[i - minJump] ? 1 : 0;
            if(i > maxJump) available -= dp[i - maxJump - 1] ? 1 : 0;

            dp[i] = available > 0 && s.charAt(i) == '0';
        }

        return dp[n - 1];
    }
}
