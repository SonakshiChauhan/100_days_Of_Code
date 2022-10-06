package com.company;
import java.util.*;
public class Find_UpperCase_letter {
    static char first(String str,int i){
       if(str.charAt(i)=='\0'){
           return 0;
       }
       if(Character.isUpperCase(str.charAt(i))){
           return str.charAt(i);
       }
       try{

           return first(str,i+1);
       }
       catch(Exception e){
           System.out.println("Exception occures");
       }
       return 0;
    }


    public static void main(String args[]){
        String str="sonakshiChauhan";
        char res=first(str,0);
        if(res == 0){
            System.out.println("No uppercase ");
        }
        else{
            System.out.println(res);
        }
    }
}
