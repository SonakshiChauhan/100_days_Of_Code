package com.company;
/*
Runtime-0 ms
Memory Usage-40.8 MB
 */
public class Determine_wether_matrix_can_be_obtained_by_rotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = target.length;
        if (mat.length != n) return false;
        for (int r = 0; r < 4; r++) {
            boolean result = true;
            for (int i = 0; i < n * n; i++) {
                int col = i % n; int row = i / n;
                int rotCol;
                int rotRow;
                switch(r)
                { case 1: rotCol = n - 1 - row;
                    rotRow = col;
                    break;
                    case 2: rotCol = n - 1 - col;
                    rotRow = n - 1 - row; break;
                    case 3: rotCol = row; rotRow = n - 1 - col; break;
                    default: rotCol = col; rotRow = row; }
                if (target[row][col] != mat[rotRow][rotCol]) { result = false; break; } }
            if (result) return true; }
        return false;
    }
}
