package com.company;

public class time_difference {

        public int findMinDifference(List<String> timePoints) {
            boolean[] time_seen= new boolean[24*60];

            for(String time:timePoints){
                String[] time_split = time.split(":");
                int hour = Integer.parseInt(time_split[0]);
                int minute = Integer.parseInt(time_split[1]);
                if(time_seen[(hour*60)+minute]) return 0;
                time_seen[(hour*60)+minute]=true;
            }

            Integer first_time_seen=null;
            Integer prev_time_seen= null;
            Integer minimum_difference = Integer.MAX_VALUE;

            for(int i=0;i<1440;i++){
                if(time_seen[i]){
                    if(first_time_seen==null){
                        first_time_seen=i;
                        prev_time_seen=i;
                    }
                    else{
                        minimum_difference=Math.min(minimum_difference,Math.min(i-prev_time_seen,1440-i+prev_time_seen));
                        prev_time_seen=i;
                    }
                }
            }
            minimum_difference=Math.min(minimum_difference,Math.min(prev_time_seen-first_time_seen,1440-prev_time_seen+first_time_seen));
            return minimum_difference;
        }
    }

