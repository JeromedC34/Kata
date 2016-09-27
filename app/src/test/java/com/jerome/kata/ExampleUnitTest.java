package com.jerome.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void stringCalculatorAddShouldReturnZeroWhenEmptyStringInput() throws Exception {
        int test_result = 0;
        StringCalculator myStringCalculator = new StringCalculator();
        assertEquals(test_result, myStringCalculator.Add(""));
    }
    @Test
    public void stringCalculatorAddShouldReturnValueOfSingleNumberStringInput() throws Exception {
        int test_result = 1;
        StringCalculator myStringCalculator = new StringCalculator();
        assertEquals(test_result, myStringCalculator.Add("1"));
    }
    @Test
    public void stringCalculatorAddShouldReturnValueOfSeveralNumbersSeparatedByCommaStringInput() throws Exception {
        int test_result = 3;
        StringCalculator myStringCalculator = new StringCalculator();
        assertEquals(test_result, myStringCalculator.Add("1,2"));
    }
}