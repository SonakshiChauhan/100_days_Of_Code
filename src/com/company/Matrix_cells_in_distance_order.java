package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Matrix_cells_in_distance_order {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int dist[][]=new int[rows][cols];
        int ans[][]=new int[rows*cols][2];
        for(int x=0;x<rows;x++){
            for(int y=0;y<cols;y++){
                dist[x][y]=Math.abs(x-rCenter)+Math.abs(y-cCenter);
                ans[x*cols+y]=new int[]{x,y};
            }
        }
        Arrays.sort(ans, Comparator.comparingInt(o -> dist[o[0]][o[1]]));
        return ans;
    }
}
