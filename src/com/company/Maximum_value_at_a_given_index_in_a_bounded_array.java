package com.company;
/*
Runtime-2ms
Memory usage-41.5 MB
 */
public class Maximum_value_at_a_given_index_in_a_bounded_array {
    public int maxValue(int n, int index, int maxSum) {
        long r=n-index-1;
        long l=index;
        int st=1;
        int ed=maxSum;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            long sum=mid;
            long ls=0, rs=0, m=mid-1;
            if(r<=m) rs=m*(m+1)/2-(m-r)*(m-r+1)/2;
            else rs=m*(m+1)/2 + 1*(r-m);
            if(l<=m) ls=m*(m+1)/2-(m-l)*(m-l+1)/2;
            else ls=m*(m+1)/2 + 1*(l-m);
            sum+=ls+rs;
            if(sum<maxSum){
                st=mid+1;
            }
            else if(sum>maxSum){
                ed=mid-1;
            }
            else{
                return mid;
            }
        }
        return ed;
    }
}
