package com.company;

public class no_of_substings_with_1s {
    public long subStrCount(long n){
        return (n*(n+1))/2l;
    }
    public int numSub(String s) {
        int n =s.length();
        int len=0;
        long ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){len++;}
            else{ans=(ans%1000000007+subStrCount(len)%1000000007)%1000000007;
                len=0;
            }
        }
        ans+=subStrCount(len);
        return (int)(ans);
    }
}
