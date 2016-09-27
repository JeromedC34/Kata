package com.jerome.kata;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class StringCalculator {
    int Add(String string) {
        if (string.equals("")) {
            return 0;
        } else {
            return Integer.valueOf(string);
        }
    }
}
