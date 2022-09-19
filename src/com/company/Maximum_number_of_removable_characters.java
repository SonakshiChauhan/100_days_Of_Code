package com.company;

public class Maximum_number_of_removable_characters {
    public int maximumRemovals(String s, String p, int[] removable) {
        int ans=0,start=1,end=removable.length;

        while(start<=end){
            int mid = (start + end)/2;
            //check if `p` is subsequence of `s` or not after removing some of elements
            if(p_is_Sbusequence_of_s(s,p,mid,removable)){
                ans = mid;
                start = mid+1;   //if it's true remove another element
            }
            else{
                end = mid-1;   //if it's not true remove one element less than previous
            }
        }

        return ans;
    }


    public static boolean p_is_Sbusequence_of_s(String s , String p, int mid , int[]a){

        char []ch = s.toCharArray();

        for(int i=0;i<mid;i++){
            ch[a[i]]='*';    //it's better to replace the chars with symbols than remove it
        }

        int i=0,j=0;
        //two pointer method to match string `p` and char array `ch`
        while(i<ch.length && j<p.length()){
            if(ch[i]==p.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        //if j reached to the index of size of p String then all of it's chars were matched sucessfully, return TRUE
        //if it's not return FALSE
        return j==p.length();
    }
}
