package com.company;
/*
Runtime-1ms
Space-42.3 MB
 */
public class Sorting_string {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String newstr[]=new String[10];

        for(int i=0;i<str.length;i++){
            int lastindex=str[i].charAt(str[i].length()-1)-'0';
            newstr[lastindex]=str[i].substring(0,str[i].length()-1);
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<=9;i++){
            if(newstr[i]==null){
                continue;
            }
            sb.append(newstr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
