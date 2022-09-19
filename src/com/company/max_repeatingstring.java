package com.company;
/*
Runtime-2ms
 */
public class max_repeatingstring {
    public int maxRepeating(String sequence, String word) {

        int[] dp = new int[sequence.length()];

        int maxLen = 0;

        for (int i = 0; i < sequence.length(); i++){

            if(i+ word.length() <= sequence.length()){

                String substr = sequence.substring(i, i +word.length());

                if(substr.equals(word))

                    dp[i] = 1;

            }

        }

        for (int i = 0; i < sequence.length(); i++){

            if(i-word.length() >= 0 && (dp[i] >0 && dp[i-word.length()] > 0))

                dp[i] = dp[i] + dp[i-word.length()];

            maxLen = Math.max(maxLen, dp[i]);

        }

        return maxLen;

    }
}
