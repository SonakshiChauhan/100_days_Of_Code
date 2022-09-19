package com.company;
/*
Time-1ms
 */
public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");

        // find min width str .

        int min = Integer.MAX_VALUE ;

        for(String str : strs) min = Math.min(min , str.length());



        outer : for( int i = 0 ; i < min ; i++){ // labeling for loop is allwoed in java

            char prefix = strs[0].charAt(i);

            inner : for(String str : strs){

                char temp = str.charAt(i);

                if(temp != prefix) break outer ; // break from the outer labeled for loop .

            }

            sb.append(prefix);

        }



        return sb.toString();

    }
}
