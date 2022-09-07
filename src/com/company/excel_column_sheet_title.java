package com.company;
/*
Runtime:0ms
Space:41.2 MB
 */
public class excel_column_sheet_title {
    public String convertToTitle(int n) {
        // return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append((char) ('A' + --n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
