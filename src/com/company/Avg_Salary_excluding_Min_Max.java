package com.company;

public class Avg_Salary_excluding_Min_Max {
    public double average(int[] salary) {
        int max=salary[0],min=salary[0],sum=0;
        for(int i:salary){
            sum+=i;
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        return (double)(sum-max-min)/(salary.length-2);
    }
}
