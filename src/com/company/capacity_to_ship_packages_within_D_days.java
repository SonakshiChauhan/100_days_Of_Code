package com.company;
/*
Runtime-12 ms
Memory-53.4 MB
 */
public class capacity_to_ship_packages_within_D_days {
    public int shipWithinDays(int[] weights, int days) {

        int sum=0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max)max=weights[i];
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(fnc(mid,weights,weights.length,days)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    boolean fnc(int mid,int arr[],int N,int D){
        int sum=0;
        int days=1;
        for(int i=0;i<N;i++){
            if(sum+arr[i]<=mid)sum+=arr[i];
            else{
                sum=arr[i];
                days++;
            }
        }
        if(days<=D)return true;
        return false;
    }
}
