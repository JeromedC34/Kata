package com.jerome.kata;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class StringCalculator {
    int add(String string) {
        StringTokenizer myStringTokenizer = new StringTokenizer(string, ",\n");
        int result = 0;
        while (myStringTokenizer.hasMoreElements()) {
            result += Integer.valueOf(myStringTokenizer.nextElement().toString());
        }
        return result;
    }
}
