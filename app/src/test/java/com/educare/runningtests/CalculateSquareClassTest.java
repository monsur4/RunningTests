package com.educare.runningtests;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateSquareClassTest {

    @Test
    public void calculateSquare() {
        CalculateSquareClass calc = new CalculateSquareClass();
        int number = 5;
        assertEquals(25, calc.calculateSquare(5));
    }
}