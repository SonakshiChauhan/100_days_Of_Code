package com.company;

import java.util.Map;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        var letters = Map.of(

                'I', 1,

                'V', 5,

                'X', 10,

                'L', 50,

                'C', 100,

                'D', 500,

                'M', 1000

        );

        int sum = 0;

        int lastValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int val = letters.get(s.charAt(i));

            sum = val >= lastValue ? sum + val : sum - val;

            lastValue = val;

        }

        return sum;
    }
}
