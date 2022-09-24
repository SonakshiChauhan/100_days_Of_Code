package com.company;

/*public class Kth_bit_in_Nth_binaryString {
    public char findKthBit(int n, int k) {
        boolean flip = false;
        while (k != 1) {
            int base = floorTwo(k);
            if (base == k) {
                return flip ? '0' : '1';
            }
            flip = !flip;
            k = base - (k - base);
        }
        return flip ? '1' : '0';
    }

    public int floorTwo(int k) {
        while ((k & (k - 1)) > 0) {
            k &= k - 1;
        }
        return k;
    }
}*/
