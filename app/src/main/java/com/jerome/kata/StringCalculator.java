package com.jerome.kata;

import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class StringCalculator {
    int add(String string) {
        int result = 0;
        String mySeparator;
        String myStringToTest;
        if (string.length() > 2 && string.substring(0, 2).equals("//")) {
            mySeparator = string.substring(2, 3) + "\n";
            myStringToTest = string.substring(3);
        } else {
            mySeparator = ",\n";
            myStringToTest = string;
        }
        StringTokenizer myStringTokenizer = new StringTokenizer(myStringToTest, mySeparator);
        while (myStringTokenizer.hasMoreElements()) {
            result += Integer.valueOf(myStringTokenizer.nextElement().toString());
        }
        return result;
    }
}
