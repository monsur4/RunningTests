package com.educare.runningtests;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    static MainActivity sMain;

    /*
    * any variables set by the before class has to be static
    * */
    @BeforeClass
    public static void classSetup() throws Exception{
        sMain = new MainActivity();
    }

    @Test
    public void calculateSquare() {
        int number = 5;
        assertEquals(25, sMain.calculateSquare(5));
    }
}