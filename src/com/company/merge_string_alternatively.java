package com.company;

public class merge_string_alternatively {
    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int itr = 0, jtr = 0, ktr = 0;



        while( (itr < word1.length()) || (jtr < word2.length())){

            if(itr < word1.length()){

                if(ktr % 2 == 0){

                    result += word1.charAt(itr++);

                }

            }



            if(jtr < word2.length()){

                if(ktr % 2 == 1){

                    result += word2.charAt(jtr++);

                }

            }

            ktr++;

        }

        return result;
    }
}
