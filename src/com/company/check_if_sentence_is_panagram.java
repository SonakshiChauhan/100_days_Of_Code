package com.company;
/*
Runtime-1ms
Memory Usage-40.6 MB
 */
public class check_if_sentence_is_panagram {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();

        if(sentence.length()<26){
            return false;
        }
        for(char x='a';x<='z';x++){
            if(!sentence.contains(String.valueOf(x)))
                return false;

        }
        return true;
    }
}
