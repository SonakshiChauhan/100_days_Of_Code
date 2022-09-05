package com.company;
/*
Runtime:1ms
Space:40 MB
 */
public class encryption_decryption {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i<s.length()-2 && s.charAt(i+2)=='#'){
                char temp = (char)(96+Integer.parseInt(s.substring(i,i+2)));
                ans.append(temp);
                i+=2;
            }else{
                char temp = (char)(48+(int)s.charAt(i));
                ans.append(temp);
            }
        }
        return ans.toString();

    }
}
